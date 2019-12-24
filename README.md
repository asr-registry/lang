## Library for shared functionalities


These are the mostly used functions in the system which include:

- Multi-Tenancy Header Filer
- Services Name
- Object Utility Class
- Logger Aspect 
- Security Aspect 
- Common Enums
- Common Exceptions
- Listener Configs
- Validation 
- and more


### Key Generation

java -cp build/libs/lang-0.1.0-BUILD-SNAPSHOT.jar af.asr.lang.security.RsaKeyPairFactory SPRING > application-dev.properties

java -cp build/libs/lang-0.1.0-BUILD-SNAPSHOT.jar  af.asr.lang.security.RsaKeyPairFactory UNIX > env.vars.txt
<br/>

source env.vars.txt

<br/>
echo $PUBLIC_KEY_TIMESTAMP



