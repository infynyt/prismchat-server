# Prismchat Server

This is the server module for Prismchat. To use Prismchat, you need a client application. Here is a list of Prismchat clients:

| Name | Language | Device Compatibility | Source Code | Server Versions | Status |
| - | - | - | - | - | - |
| Prismchat Desktop | Python | Windows Mac | [GitHub](https://github.com/infynyt/prismchat-client) | 1.x.x | In Dev |
| Prismchat CLI | Haxe Java C++ | Windows Mac Linux BSD | Proprietary | 1.x.x | In Dev |
| Prismchat Mobile | JavaScript | Android iOS | N/A | N/A | Planned |
| Prismchat Web | JavaScript | Web | N/A | N/A | Planned |

## Setting up the workspace

### Step 1: Install haxe

Windows: Run `winget install HaxeFoundation.Haxe` in your favorite terminal or download the installer from [the official haxe website](https://haxe.org/download)
MacOS: Run `brew install haxe` in your favorite terminal or download the installer from [the official haxe website](https://haxe.org/download)
Arch Linux Distros: Run `sudo pacman -S haxe` in your favorite terminal
Debian/Ubuntu Linux Distros: Run `sudo apt install haxe` in your favorite terminal
Fedora Linux Distros: Run `sudo dnf install haxe` in your favorite terminal
Other Linux Distros: Find installation instructions on [the official haxe website](https://haxe.org/download/linux)

### Step 2: Install a compiler

You can choose to compile natively with C++ or with Java.

Java: Install a Java Development Kit of your choice.
C++/Windows: Install Microsoft Visual C++ compiler
C++/MacOS & Linux: Install GNU GCC compiler

### Step 3: Install haxe dependencies

IMPORTANT NOTICE FOR LINUX USERS: In order to use haxelib, you will have to type `haxelib setup` to specify a directory to store downloaded packages.

Run the following commands regardless if you are using C++ or Java:```
haxelib install hxcpp
haxelib install hxjava
haxelib install hx_webserver
haxelib install console.hx```

### Step 4: Build and test the application

Java:
Run `haxe ./build.hxml` and `java -jar bin/java/Main.jar` in your terminal
or just run `./test.sh` in your terminal
