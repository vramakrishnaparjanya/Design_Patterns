import java.io.IOException;

public class ProxyPatternTest {

    public static void main(String[] args) throws IOException {

        testProxyWrongPwd();
        testProxyCorrect();
    }

    public static void testProxyWrongPwd(){
        CommandExecutor executor = new CommandExecutorProxy("Ram", "wrong_pwd");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }
    }

    public static void testProxyCorrect(){
        CommandExecutor executor = new CommandExecutorProxy("Ram", "Password");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }
    }

}
