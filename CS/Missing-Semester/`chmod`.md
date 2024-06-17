`chmod`, which stands for **"change mode"**, is used to change the access permissions of files and directories in Unix and Unix-like operating systems.

### Full Name:
**chmod** - change file mode bits.

### Usage:
The `chmod` command can modify read, write, and execute permissions for the user, group, and others.

### Basic Syntax:
```sh
chmod [options] mode file
```

### Common Modes:
- `r` - read permission
- `w` - write permission
- `x` - execute permission

### Symbolic Mode:
Permissions can be changed using symbolic notation:
- `u` - user (file owner)
- `g` - group
- `o` - others
- `a` - all (user, group, and others)

### Examples:
1. **Add Execute Permission for the User**:
   ```sh
   chmod u+x filename
   ```
2. **Remove Write Permission for Group and Others**:
   ```sh
   chmod go-w filename
   ```
3. **Set Read and Write Permissions for All**:
   ```sh
   chmod a+rw filename
   ```

### Numeric (Octal) Mode:
Permissions can also be set using numeric (octal) values:
- `4` - read
- `2` - write
- `1` - execute

### Example:
- **Full Permissions for User, Read and Execute for Group and Others**:
  ```sh
  chmod 755 filename
  ```

### Options:
- `-R`: Apply changes recursively to directories and their contents.
  ```sh
  chmod -R 755 directory
  ```

### Examples in Detail:
1. **Give User Execute Permission**:
   ```sh
   chmod u+x /tmp/missing/semester
   ```
   This command adds execute permission for the user (owner) of the file.

2. **Set Specific Permissions Using Numeric Mode**:
   ```sh
   chmod 644 /tmp/missing/semester
   ```
   This sets read and write permissions for the user, and read-only permissions for group and others.

3. **Remove All Permissions for Others**:
   ```sh
   chmod o-rwx /tmp/missing/semester
   ```
   This removes all permissions (read, write, and execute) for others.

4. **Recursively Change Permissions of a Directory**:
   ```sh
   chmod -R 755 /path/to/directory
   ```
   This sets the permissions of the directory and all its contents to 755.
