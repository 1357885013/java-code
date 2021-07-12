package ljj.base.threads;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;

public class PrintThreads {
    public static void main(String[] args) {
        // �鿴����ϵͳ�߳�
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println(threadInfo.getThreadId()+" "+threadInfo.getThreadName()+" "+ Arrays.stream(threadInfo.getStackTrace()).count());
        }
    }
}
