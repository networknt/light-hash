# light-hash
A command line utiltity that hashes the key or password with PBKDF2WithHmacSHA1

Some light-4j modules, for example, api-key, need to save the hash into the configuration file to validate against the input password or key. Users can use this command-line utility to hash the clear-text API key value and check it into the repository with the apikey.yml file. During the runtime, the ApiKeyHandler will compare the hash from the config file against the input hash with the HashUtil. 

### Usage

The jar file has been released to maven central, and it can be downloaded from the following [Download URL](https://repo1.maven.org/maven2/com/networknt/light-hash/1.0.0/light-hash-1.0.0.jar). 

Or you can download it with curl in the command line. 

```
curl -k -o light-hash-1.0.0.jar https://repo1.maven.org/maven2/com/networknt/light-hash/1.0.0/light-hash-1.0.0.jar
```

If your organization has Artifactory installed to proxy the Maven Central libraries, the URL might look like the following. 

```
curl -k -o light-hash-1.0.0.jar https://artifactary.example.com/artifactory/Maven_Central/com/networknt/light-hash/1.0.0/light-hash-1.0.0.jar
```

To hash a key or a secret

```
java -jar light-hash-1.0.0.jar "secret"
```

When running the above command on Windows, enclose the plain text into double quotes("") in the command line above. 

To learn how to set up the apiKey in the apikey.yml config file, please refer to the [api-key](https://doc.networknt.com/concern/api-key/).


### Build

```
mvn clean install
```


### Release

```
mvn clean install deploy -DperformRelease
```

