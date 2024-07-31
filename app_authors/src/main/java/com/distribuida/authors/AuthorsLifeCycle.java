package com.distribuida.authors;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AuthorsLifeCycle {

//    //el observes monitorea
//    @ConfigProperty(name= "consul.port", defaultValue = "8500")
//    private int consulPort;
//
//    @ConfigProperty(name= "consul.host", defaultValue = "localhost")
//    private String consulHost;
//
//    @ConfigProperty(name= "quarkus.http.port")
//    private int port;
//
//    private String serviceID;
//
//    public  void init(@Observes StartupEvent evt, Vertx vertx) throws UnknownHostException {
//        System.out.println("********AuthorsLifeCycle.init");
//
//        ConsulClient client = ConsulClient.create(vertx,
//                new ConsulClientOptions().setHost(consulHost).setPort(consulPort)
//        );
//
//        serviceID = UUID.randomUUID().toString();
//        var ipAddress=InetAddress.getLocalHost();
//
//        String httpCheckUrl= String.format("http://%s:%d/q/health/live",ipAddress.getHostAddress(),port);
//
//        client.registerServiceAndAwait(
//                new ServiceOptions()
//                        .setName("app_authors")
//                        .setId(serviceID)
//                        .setAddress(ipAddress.getHostAddress())
//                        .setPort(port)
//                        .setTags(
//                                List.of("traefik.enable=true",
//                                        "traefik.http.routers.app_authors.rule=PathPrefix(`/app_authors`)",
//                                        "traefik.http.routers.app_authors.middlewares=app_authors",
//                                        "traefik.http.middlewares.app_authors.stripPrefix.prefixes=/app_authors")
//                        )
//                        .setCheckOptions(
//                                new CheckOptions(
//                                )
//                                        .setHttp(httpCheckUrl)
//                                        .setInterval("10s")
//                                        .setDeregisterAfter("20s")
//                        )
//        );
//    }
//
//    public void stop(@Observes ShutdownEvent evt, Vertx vertx){
//        System.out.println("********AuthorsLifeCycle.stop");
//
//        ConsulClient client = ConsulClient.create(vertx,
//                new ConsulClientOptions().setHost(consulHost).setPort(consulPort)
//        );
//
//        client.deregisterServiceAndAwait(serviceID);
//    }
}
