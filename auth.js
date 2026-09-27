
const crypto = require('crypto');

function hashPassword(password) {
  // WEAK HASH: MD5
  return crypto.createHash('md5').update(password).digest('hex');
}

function encryptData(data) {
  // WEAK CIPHER: DES
  const cipher = crypto.createCipheriv('des-cbc', Buffer.alloc(8), Buffer.alloc(8));
  return cipher.update(data, 'utf8', 'hex') + cipher.final('hex');
}
