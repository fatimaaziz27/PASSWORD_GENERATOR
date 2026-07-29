// Password Generator
#include <iostream>
#include <string>
#include <cstdlib>
#include <ctime>

using namespace std;

string generatePassword(int length) {

    string characters =
        "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        "abcdefghijklmnopqrstuvwxyz"
        "0123456789"
        "!@#$%^&*()_-+=<>?/{}[]";

    string password = "";

    for (int i = 0; i < length; i++) {
        int index = rand() % characters.length();
        password += characters[index];
    }

    return password;
}

int main() {

    srand(time(0));

    int length;

    cout << "Enter password length: ";
    cin >> length;

    cout << "Generated Password: " << generatePassword(length) << endl;

    return 0;
}
