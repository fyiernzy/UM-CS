1. 前往 [Maven 官网](https://maven.apache.org/download.cgi) 下载 Maven
   ![[3-maven-install-1.png]]

2. 解压 Maven 压缩包到特定位置。这里，笔者选择了 `Program Files/Apache`。Apache 是笔者自己新建的文件夹。
   ![[3-maven-install-2.png]]
3. 点开 `Program Files/Apache/apache-maven-3.9.7/bin`，如下：
   ![[3-maven-install-3.png]]
4. 单击文件路径，并右键复制。
   ![[3-maven-install-4.png]]
5. 点击键盘上的 Windows 键，输入 `env` 打开 System Properties。
   ![[3-maven-install-5.png]]
6. 选择 `Environment Variable`
   ![[3-maven-install-6.png]]

7. 在 `System Variables` 的选择下找到 `Path`。
   ![[3-maven-install-7.png]]
8. 双击打开 `Path`，点击 `New`
   ![[3-maven-install-8.png]]
9. 粘贴刚才复制的路径，并点击 Ok
   ![[3-maven-install-9.png]]
10. 按下键盘上的 Windows 键，输入 `cmd` 打开 Command Prompt。
11. 输入 `mvn --version` 检查是否安装成功。如果出现以下信息则为安装成功。
    ![[3-maven-install-10.png]]