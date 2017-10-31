1、随便找个位置建文件夹（路径最好都是英文），然后在里面建个src文件夹，下载下面那两个包，将generatorConfig.xml拷进去，最后打开cmd，进到文件夹，执行下面的命令，代码就会生成到src文件夹里

2、cmd命令
java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite
?
3、可做成.bat文件备用，放在目录运行即可
cmd命令
set current_path="%cd%"
java -jar mybatis-generator-core-1.3.2.jar -configfile generatorConfig.xml -overwrite
pause
exit