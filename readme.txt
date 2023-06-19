spring-boot-starter-web, creates WebServer Beans, that use Non-Daemon Listener Threads.
these threads are those that keep the application alive and running.
these threads wait for Incoming Connections and handle them.

This makes your code reach end of your main method, however JVM does not exit, as it has non-daemon threads running.