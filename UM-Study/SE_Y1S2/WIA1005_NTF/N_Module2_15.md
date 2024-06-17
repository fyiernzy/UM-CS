# IP Static Routing

1. 4 types of static route
    1. Standard
    2. Default
    3. Floating
    4. Summary

2. 3 Next-Hop options
    | Options                         | Description                                 |
    | ------------------------------- | ------------------------------------------- |
    | Next-hop route                  | Only the next-hop IP address is specified   |
    | Directly connected static route | Only the router exit interface is specified |
    | Fully specified static route    | The next-hop IP address and exit interface are specified |

3. The destination network in an IPv6 static route is identified using an IPv6 prefix and prefix length.

4. Using the exit interface only is common in a point-to-point configuration.

## Static route types

1. Fully specified static route is used when the exit interface is a multi-access interface and it is necessary to explicitly identify the next hop.

2. Including a next-hop address is recommended for static routes on Ethernet networks.

3. It is generally recommended to use a next-hop address.

4. Directly connected static routes are suitable for point-to-point serial interfaces only.

5. A point-to-point serial network has only one other device on that network, the router at the other end of the link.

6. Ethernet multi-access networks have many different devices sharing the same multi-access network, including hosts and even multiple routers.

7. For IPv6 static routes with an IPv6 link-local next-hop address, a fully specified static route should be used.
    - IPv6 link-local addresses are not present in the IPv6 routing table.
    - Link-local addresses are only unique within a specific link or network.
    - The next-hop link-local address could be valid on multiple networks connected to the router.
    - Including the exit interface is necessary to ensure accurate routing.
