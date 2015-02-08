# List Security Providers

This is a small Karaf console command that lists the available Java security providers.

Tested on Karaf 3.0.3, Java 1.7.

# Usage

Sample console session:

    karaf@root()> securityproviders:list
    SUN version 1.7
      SUN (DSA key/parameter generation; DSA signing; SHA-1, MD5 digests; SecureRandom; X.509 certificates; JKS keystore; PKIX CertPathValidator; PKIX CertPathBuilder; LDAP, Collection CertStores, JavaPolicy Policy; JavaLoginConfig Configuration)
    SunRsaSign version 1.7
      Sun RSA signature provider
    SunEC version 1.7
      Sun Elliptic Curve provider (EC, ECDSA, ECDH)
    SunJSSE version 1.7
      Sun JSSE provider(PKCS12, SunX509 key/trust factories, SSLv3, TLSv1)
    SunJCE version 1.7
      SunJCE Provider (implements RSA, DES, Triple DES, AES, Blowfish, ARCFOUR, RC2, PBE, Diffie-Hellman, HMAC)
    SunJGSS version 1.7
      Sun (Kerberos v5, SPNEGO)
    SunSASL version 1.7
      Sun SASL provider(implements client mechanisms for: DIGEST-MD5, GSSAPI, EXTERNAL, PLAIN, CRAM-MD5, NTLM; server mechanisms for: DIGEST-MD5, GSSAPI, CRAM-MD5, NTLM)
    XMLDSig version 1.0
      XMLDSig (DOM XMLSignatureFactory; DOM KeyInfoFactory)
    SunPCSC version 1.7
      Sun PC/SC provider
    Apple version 1.1
      Apple Provider
    karaf@root()>


# Build and Install to Karaf

## Build

Build and install to local repository using [Maven](http://maven.apache.org).

    mvn install

## Install to Karaf

You can install the bundle to Karaf once it is in the local Maven repository. Install as you
would other bundles from Maven repository:

    karaf@root()> install -s mvn:fi.jarimatti.karaf/listsecurityproviders/1.0.1

Note that this project is not in public Maven repositories, so at the moment you must build it yourself first.

# License

Copyright (c) 2015, Jarimatti Valkonen <jarimatti@me.com>

All rights reserved.

Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:

1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.

2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.


