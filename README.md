# spring-demo-one
Semple Dependency injection concept
   #1.constructor injection: the dependencies are provided through a class constructor.
   #2.setter injection: the client exposes a setter method that the injector uses to inject the dependency.
   #3.interface injection: the dependency provides an injector method that will inject the dependency into 
   any client passed to it. Clients must implement an interface that exposes a setter method that accepts the dependency.
