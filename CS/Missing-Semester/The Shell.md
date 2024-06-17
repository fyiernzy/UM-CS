## Basic Command
---

| Command             | Explanation                                                                                                                                                                                                                                                                          |
| ------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `date`              | get the current date                                                                                                                                                                                                                                                                 |
| `pwd`               | present current directory                                                                                                                                                                                                                                                            |
| `cd`                | change directory                                                                                                                                                                                                                                                                     |
| `../`               | parent directory                                                                                                                                                                                                                                                                     |
| `./`                | relative directory                                                                                                                                                                                                                                                                   |
| `~`                 | home directory                                                                                                                                                                                                                                                                       |
| `-`                 | previous directory                                                                                                                                                                                                                                                                   |
| `ls`                | list                                                                                                                                                                                                                                                                                 |
| `ls -l`             | list long                                                                                                                                                                                                                                                                            |
| `mv`                | > move file<br>> can be used to change file location/ rename file                                                                                                                                                                                                                    |
| `cp`                | copy                                                                                                                                                                                                                                                                                 |
| `rm`                | remove (a file)                                                                                                                                                                                                                                                                      |
| `rm -r`             | remove recursively (the directory and all the files)                                                                                                                                                                                                                                 |
| `rmdir`             | remove an empty directory                                                                                                                                                                                                                                                            |
| `mkdir`             | 1. `mkdir My Photos` (2 directories)<br>2. `mkdir My\ Photos` (1 directory)<br>3. `mkdir "My Photos"` (1 directory)                                                                                                                                                                  |
| `mkdir -p`          | The `-p` option in the `mkdir` command stands for "parents." It allows you to create a directory and any necessary parent directories in the path that don't already exist.<br><br>`mkdir -p /tmp/missing`                                                                           |
| `man`               | manual                                                                                                                                                                                                                                                                               |
| `clear`<br>`Ctrl-l` | clear                                                                                                                                                                                                                                                                                |
| `cat`               | read content                                                                                                                                                                                                                                                                         |
| `touch`             | - **Creating an empty file**: If the specified file doesn't exist, `touch` will create an empty file with the given name.<br><br>- **Updating the timestamp**: If the specified file already exists, `touch` will update its access and modification timestamps to the current time. |

```bash
drwxr-xr-x 1 User 197121   0 May  9 19:04 OTHERS_Cocurricular/
drwxr-xr-x 1 User 197121   0 Jul 15  2023 OTHERS_Note/
drwxr-xr-x 1 User 197121   0 May  9 18:59 OTHERS_Screenshot/
drwxr-xr-x 1 User 197121   0 May  9 19:15 YEAR_Others/
drwxr-xr-x 1 User 197121   0 Jul 15  2023 YEAR_Year-1/
drwxr-xr-x 1 User 197121   0 May  9 19:15 YEAR_Year-2/
```

```
d|rwx|rwx|rwx
```
- `d/l/-`
	- `d` - indicates a directory
	- `l` - indicates a symbolic link
	- `-` - indicates regular file
- `rwx`
	- `r` - read
	- `w` - write
	- `x` - execute
- `rwx|rwx|rwx`
	- 1st `rwx` - permission of Owner
	- 2nd `rwx`- permission of Group
	- 3rd `rwx`- permission of Others

## Data Wrangling (Basic)
---
- `>>` append
- `>` rewires the output/ overwrite
- `<` rewires the input

### 1. `curl --head --silent google.com | grep -i content-length | cut --delimiter=" " -f2`
   
`curl --head --silent google.com`
- `curl` send an HTTP HEAD request to the `google.com`
- `--head` fetches only the headers of the response
- `--silent` makes `curl` operates quietly, suppressing progress information

`| grep -i content-length`
- The output from `curl` is piped (`|`) to `grep` (Global Regular Expression Print)
- `grep` searches for the line containing `Content-Length` in a case-insensitive manner (`-i`).

`| cut --delimeter=" " -f2`
- The line founded by `grep` is then piped to `cut`
- `cut` uses a space as the delimiter (`--delimiter=" "`) and extracts the second field (`-f2`), which is the value of the `Content-Length`

### 2. `ls -l | tail -n1`
This command lists the details of files in a directory and shows the last line of the listing.

- `ls -l`: Lists files in the current directory in long format, showing details such as permissions, number of links, owner, group, size, and modification date.
- `| tail -n1`: Pipes the output of `ls -l` to `tail`, which shows only the last line of the output (`-n1`).

### 3. `tee`
The `tee` command reads from standard input and writes to standard output and files simultaneously.

- `tee filename`: Takes input from a command, writes it to the specified file (`filename`), and also outputs it to the terminal.

### 4. `echo Hello | sudo tee brightness`
This command uses `echo` to write "Hello" to a file named `brightness` with elevated permissions.

- `echo Hello`: Outputs the string "Hello".
- `| sudo tee brightness`: Pipes the output of `echo` to `tee`, which writes "Hello" to the file `brightness` with `sudo` (superuser) privileges. Using `tee` in this way allows you to write to a file requiring elevated permissions without needing to open a text editor with `sudo`.
## Quoting
#### Single Quotes (`'`)
> Enclosing characters in single quotes (‘'’) preserves the literal value of each character within the quotes. A single quote may not occur between single quotes, even when preceded by a backslash.

When you enclose text in single quotes, the text is taken literally. Everything within single quotes is treated as a literal string, and no special characters (including variables, command substitutions, or escape sequences) are interpreted. This is useful when you want to include characters that might otherwise be interpreted by the shell, such as `!`, `$`, or `\`.

#### Double Quotes (`"`)
> Enclosing characters in double quotes (‘"’) preserves the literal value of all characters within the quotes, with the exception of ‘$’, ‘`’, ‘\’, and, when history expansion is enabled, ‘!’.

When you enclose text in double quotes, the text is still treated mostly as a literal string, but with some exceptions. Certain special characters and sequences are still interpreted within double quotes, including:

- **Variable expansion**: `$VARIABLE` will be replaced with the value of `VARIABLE`.
- **Command substitution**: `` `command` `` or `$(command)` will be replaced with the output of `command`.
- **Escape sequences**: `\n`, `\t`, etc., will be interpreted as newline, tab, etc.

## Advanced Knowledge

### `sh`
1. The `sh` interpreter, also known as the Bourne shell, is a command-line interpreter for Unix-like operating systems.
2. Key Features:
   - **Script Execution**: Executes shell scripts to automate tasks.
   - **Command Interpretation**: Reads and executes commands from the user or a script.
   - **Pipelines and Redirection**: Supports pipelines (`|`) and redirection (`<`, `>`, `>>`).
   - **Control Structures**: Supports conditionals, loops, and case statements.
   - **Environment Management**: Manages environment variables.

3. Running `sh /tmp/missing/semester` explicitly uses the `sh` interpreter to execute the script.
4. The `sh` command reads and executes the `semester` file line by line.

### Shebang Interpretation
1. To execute a script directly as an executable:
   - **Shebang Line**: The script must start with `#!/bin/sh` to indicate the interpreter.
   - **Executable Permission**: The script file must have execute permissions, set with `chmod +x /tmp/missing/semester`.

2. Why `sh /tmp/missing/semester` Works but `./semester` Didn’t:
   - **Without Execute Permission**: `sh /tmp/missing/semester` works because it explicitly calls the `sh` interpreter, bypassing the need for execute permissions. `./semester` requires execute permissions to run.
   - **Shebang Interpretation**: The shebang line is used only when the script is run as an executable (`./semester`). It is not needed when using `sh /tmp/missing/semester`, as `sh` directly interprets the script.

### Practices
---
`./tmp/missing/semester | grep -i last-modified | tee last-modified.txt`


## Reference
---
1. https://www.youtube.com/watch?v=Z56Jmr9Z34Q
2. https://missing.csail.mit.edu/2020/course-shell/
3. https://www.gnu.org/software/bash/manual/html_node/Quoting.html
4. https://en.wikipedia.org/wiki/Shebang_(Unix)