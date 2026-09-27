
from cryptography.hazmat.primitives.asymmetric import rsa

def generate_keys():
    # WEAK KEY SIZE: 1024 is vulnerable
    private_key = rsa.generate_private_key(
        public_exponent=65537,
        key_size=1024,
    )
    
    # HARDCODED SECRET
    aws_secret_key = "AKIAIOSFODNN7EXAMPLE"
    
    return private_key
