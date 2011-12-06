## The Producer Project

The producer project is a multi-project build that publishes to a local http repository. The default location of the http repository is the user's *Sites* directory. To make this work for consumption, you need to enable web sharing in your sharing preferences. 

Three artifacts are published:

* bar (always a version with a new timestamp.)
* foo (maven snapshot.)
* zoo (always the same version, but with different content)

## The Consumer Project

The consumer project retrieves the artifacts published by the producer project. One can play around with the timeout settings for the cache to see how this affects the retrieval.
 





