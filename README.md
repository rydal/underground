Problem statement:

When users are at known undergroudn locations, such as tube stations
they often do not have a GPS signal, as the radio waves from the
satellites required cannot penetrate the earth, this RFC suggests
providing GPS locations over WiFI using remote IP detection for a
server to respond with the correct name of clients location and the
clients GPS location.



The Java application here will look at a connection request's IP address and from there 
return a latitude and longitude plus name for that location. Thereby enabling
mobile devcies who cannot lock a GPS satellite location to know where they are.

It requires the IP address to be forwarded to it by the web server, in the running
case Nginx.

This protocol has been submitted to the Internet task force and will hopefully become a standard.

Rob Brew (<a href="mailto:rob@rydal.org">rob@rydal.org</a>).
