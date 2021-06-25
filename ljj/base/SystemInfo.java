import java.util.Map;

public class SystemInfo {
    public static void main(String[] args) {
        Map<String, String> env = System.getenv();
        env.forEach((k, v) -> {
            System.out.println(k + "                                         " + v);
        });
        System.out.println("---------------env---------------");
        System.out.println(SystemInfo.class.getClassLoader().getResource("fdsa"));
        System.out.println("---------------properties-------------------------");
        System.getProperties().forEach((k, v) -> {
            System.out.println(k + "   " + v);
        });
    }
}
//
//"C:\Program Files\Java\jdk1.8.0_201\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2020.2.3\lib\idea_rt.jar=54955:C:\Program Files\JetBrains\IntelliJ IDEA 2020.2.3\bin" -Dfile.encoding=GBK -classpath "C:\Program Files\Java\jdk1.8.0_201\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\deploy.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\ext\access-bridge-64.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\ext\cldrdata.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\ext\dnsns.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\ext\jaccess.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\ext\jfxrt.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\ext\localedata.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\ext\nashorn.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\ext\sunec.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\ext\sunjce_provider.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\ext\sunmscapi.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\ext\sunpkcs11.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\ext\zipfs.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\javaws.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\jfxswt.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\management-agent.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\plugin.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_201\jre\lib\rt.jar;C:\JAVA\MY\java-code\out\production\java-code;C:\JAVA\MY\java-code\lib\junit-jupiter-api-5.4.2.jar;C:\JAVA\MY\java-code\lib\apiguardian-api-1.0.0.jar;C:\JAVA\MY\java-code\lib\opentest4j-1.1.1.jar;C:\JAVA\MY\java-code\lib\junit-platform-commons-1.4.2.jar;C:\JAVA\MY\java-code\lib\log4j-1.2.9.jar;C:\JAVA\MY\java-code\lib\ojdbc5.jar;C:\JAVA\MY\java-code\lib\jna-5.2.0.jar;C:\JAVA\MY\java-code\lib\rxjava-2.2.8.jar;C:\JAVA\MY\java-code\lib\commons-cli-1.4.jar;C:\JAVA\MY\java-code\lib\httpcore5-5.0.2.jar;C:\JAVA\MY\java-code\lib\slf4j-api-1.7.25.jar;C:\JAVA\MY\java-code\lib\httpclient5-5.0.3.jar;C:\JAVA\MY\java-code\lib\commons-codec-1.13.jar;C:\JAVA\MY\java-code\lib\httpcore5-h2-5.0.2.jar;C:\JAVA\MY\java-code\lib\jna-platform-5.2.0.jar;C:\JAVA\MY\java-code\lib\httpclient5-win-5.0.3.jar;C:\JAVA\MY\java-code\lib\reactive-streams-1.0.2.jar;C:\JAVA\MY\java-code\lib\httpclient5-cache-5.0.3.jar;C:\JAVA\MY\java-code\lib\httpcore5-testing-5.0.2.jar;C:\JAVA\MY\java-code\lib\httpclient5-fluent-5.0.3.jar;C:\JAVA\MY\java-code\lib\httpcore5-reactive-5.0.2.jar;C:\JAVA\MY\java-code\lib\opentest4j-1.1.1-javadoc.jar;C:\JAVA\MY\java-code\lib\httpclient5-testing-5.0.3.jar;C:\JAVA\MY\java-code\lib\apiguardian-api-1.0.0-javadoc.jar;C:\JAVA\MY\java-code\lib\junit-jupiter-api-5.4.2-javadoc.jar;C:\JAVA\MY\java-code\lib\mysql-connector-java-5.1.40-bin.jar;C:\JAVA\MY\java-code\lib\junit-platform-commons-1.4.2-javadoc.jar" SystemInfo
//        USERDOMAIN_ROAMINGPROFILE                                         DESKTOP-HDPIDSQ
//        PROCESSOR_LEVEL                                         6
//        RegionCode                                         APJ
//        SESSIONNAME                                         Console
//        ALLUSERSPROFILE                                         C:\ProgramData
//        PROCESSOR_ARCHITECTURE                                         AMD64
//        PSModulePath                                         C:\Program Files\WindowsPowerShell\Modules;C:\windows\system32\WindowsPowerShell\v1.0\Modules
//        SystemDrive                                         C:
//        MOZ_PLUGIN_PATH                                         D:\¸£Í¥pdf\Foxit Reader\plugins\
//        USERNAME                                         42527
//        ProgramFiles(x86)                                         C:\Program Files (x86)
//        FPS_BROWSER_USER_PROFILE_STRING                                         Default
//        PATHEXT                                         .COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC
//        DriverData                                         C:\Windows\System32\Drivers\DriverData
//        OneDriveConsumer                                         C:\Users\42527\OneDrive
//        platformcode                                         KV
//        ProgramData                                         C:\ProgramData
//        ProgramW6432                                         C:\Program Files
//        HOMEPATH                                         \Users\42527
//        PROCESSOR_IDENTIFIER                                         Intel64 Family 6 Model 165 Stepping 2, GenuineIntel
//        ProgramFiles                                         C:\Program Files
//        PUBLIC                                         C:\Users\Public
//        windir                                         C:\windows
//        =::                                         ::\
//        LOCALAPPDATA                                         C:\Users\42527\AppData\Local
//        IntelliJ IDEA                                         C:\Program Files\JetBrains\IntelliJ IDEA 2020.2.3\bin;
//        USERDOMAIN                                         DESKTOP-HDPIDSQ
//        FPS_BROWSER_APP_PROFILE_STRING                                         Internet Explorer
//        LOGONSERVER                                         \\DESKTOP-HDPIDSQ
//        JAVA_HOME                                         C:\Program Files\Java\jdk1.8.0_201
//        LANG                                         zh_CN
//        GRADLE_HOME                                         C:\JAVA\software\gradle-6.7
//        OneDrive                                         C:\Users\42527\OneDrive
//        APPDATA                                         C:\Users\42527\AppData\Roaming
//        CommonProgramFiles                                         C:\Program Files\Common Files
//        Path                                         C:\Program Files\Common Files\Oracle\Java\javapath;C:\Program Files (x86)\Common Files\Oracle\Java\javapath;C:\windows\system32;C:\windows;C:\windows\System32\Wbem;C:\windows\System32\WindowsPowerShell\v1.0\;C:\windows\System32\OpenSSH\;C:\Program Files (x86)\NVIDIA Corporation\PhysX\Common;C:\Program Files\NVIDIA Corporation\NVIDIA NvDLISR;C:\Program Files\Java\jdk1.8.0_201\bin;C:\Program Files\Java\jdk1.8.0_201\jre\bin;C:\Program Files\Git\cmd;C:\Program Files\nodejs\;C:\JAVA\software\gradle-6.7\bin;C:\Users\42527\AppData\Local\Microsoft\WindowsApps;;C:\Program Files\JetBrains\IntelliJ IDEA 2020.2.3\bin;;C:\Users\42527\AppData\Roaming\npm;C:\Program Files (x86)\GitHub CLI\;C:\Program Files (x86)\Jar2Exe Wizard\;C:\Users\42527\AppData\Local\Programs\Fiddler
//        OS                                         Windows_NT
//        COMPUTERNAME                                         DESKTOP-HDPIDSQ
//        OnlineServices                                         Online Services
//        PROCESSOR_REVISION                                         a502
//        CLASSPATH                                         .;C:\Program Files\Java\jdk1.8.0_201\lib\dt.jar;C:\Program Files\Java\jdk1.8.0_201\lib\tools.jar;
//        CommonProgramW6432                                         C:\Program Files\Common Files
//        ComSpec                                         C:\windows\system32\cmd.exe
//        SystemRoot                                         C:\windows
//        TEMP                                         C:\Users\42527\AppData\Local\Temp
//        HOMEDRIVE                                         C:
//        USERPROFILE                                         C:\Users\42527
//        TMP                                         C:\Users\42527\AppData\Local\Temp
//        CommonProgramFiles(x86)                                         C:\Program Files (x86)\Common Files
//        NUMBER_OF_PROCESSORS                                         12
//        IDEA_INITIAL_DIRECTORY                                         C:\Program Files\JetBrains\IntelliJ IDEA 2020.2.3\bin
//
//        Process finished with exit code 0
//
