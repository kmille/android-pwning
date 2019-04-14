# basics (put in a wifi stick and set up an access point
pamcan -S hostapd dnsmasq
cp hostapd.conf /etc/hostapd/hostapd.conf
cp dnsmasq.conf /etc/dnsmasq.conf

ip a add 10.10.0.1/24 dev wlan0
hostapd hostapd.conf
dnsmasq --test # syntax check
systemctl start dnsmasq

iptables -t nat -A POSTROUTING -o enp2s0 -j MASQUERADE
echo 1 > /proc/sys/net/ipv4/ip_forward

# burp mitm
