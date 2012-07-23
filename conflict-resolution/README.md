1. Make sure 'web sharing' is turned on in your Mac, this link should work: http://localhost/~your_user_name 
1. Run gradle uploadArchives from the 'producer' project
2. Run gradle dependencies from the 'consumer' project
3. Describe the default conflict resolution
4. Force a different version of transitive dependency in the 'seasons' configuration
5. Force in all configurations
6. Remove forced versions and configure FAIL conflict resolution
7. Use forced version to resolve the conflict