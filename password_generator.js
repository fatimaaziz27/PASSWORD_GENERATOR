// Password Generator
function generatePassword(length = 12) {
    const characters =
        "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=<>?/{}[]";

    let password = "";

    for (let i = 0; i < length; i++) {
        const randomArray = new Uint32Array(1);
        crypto.getRandomValues(randomArray);

        const index = randomArray[0] % characters.length;
        password += characters[index];
    }

    return password;
}

console.log("NEW PASSWORD: " + generatePassword(12));
