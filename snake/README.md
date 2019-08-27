编译
===
javac -d ./classes -classpath ./classes ./src/com/work/Board.java ./src/com/work/Snake.java

执行
===
java -classpath ./classes com.work.Snake

调试编译
======
javac -g -d ./classes ./src/com/work/Board.java
javac -g -d ./classes -classpath ./classes ./src/com/work/Snake.java

调试执行
======
java -agentlib:jdwp=transport=dt_socket,server=y,suspend=y,address=8000 -cp classes/ com.work.Snake

jdb -attach 8000 

设置断点
======
stop at com.work.Board:143
next
run
cont
dump x
locals
clear com.work.Board:143


.bashrc
=======
主目录下 /home/hjh

export GRADLE_HOME=$HOME/gradle-5.5.1
export PATH=$PATH:$GRADLE_HOME/bin
export PATH=/home/hjh/.pyenv/bin:$PATH
eval "$(pyenv init -)"
eval "$(pyenv virtualenv-init -)"

java配置
========
/etc/profile

export JAVA_HOME=/usr/local/jdk1.8.0_221
export PATH=$PATH:$JAVA_HOME/bin

pyenv
=====

预先准备编译构建环境
sudo apt-get install -y make build-essential libssl-dev zlib1g-dev libbz2-dev \
libreadline-dev libsqlite3-dev wget curl llvm libncurses5-dev libncursesw5-dev \
xz-utils tk-dev libffi-dev liblzma-dev python-openssl git

自动安装
https://github.com/pyenv/pyenv-installer
curl -L https://github.com/pyenv/pyenv-installer/raw/master/bin/pyenv-installer | bash

配置
export PATH=/home/hjh/.pyenv/bin:$PATH
eval "$(pyenv init -)"
eval "$(pyenv virtualenv-init -)"