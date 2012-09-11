## The Producer Project

The producer project is a multi-project build that publishes to its build directory. As caching is not used (yet) for filesystem repositories, to demonstrate the caching in the consumer project Gradle needs to access the repository via http. To make this work you need to run once the startRepo task in the consumer project which will start a Jetty http server that lives in the daemon JVM. You need to enable the daemon to make this work. If you kill the daemon, the webserver will also stop running.

Three artifacts are published:

* bar (always a version with a new timestamp.)
* foo (maven snapshot.)
* moo (always the same version, but with different content. The sha1 is published.)
* zoo (always the same version, but with different content. The sha1 is not published.)

## The Consumer Project

The consumer project retrieves the artifacts published by the producer project. One can play around with the timeout settings for the cache to see how this affects the retrieval.
 





