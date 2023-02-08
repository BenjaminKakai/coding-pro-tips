import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class DownloadTask implements Runnable {
  private String url;

  public DownloadTask(String url) {
    this.url = url;
  }

  @Override
  public void run() {
    try {
      URL fileUrl = new URL(url);
      try (BufferedReader reader = new BufferedReader(new InputStreamReader(fileUrl.openStream()))) {
        String line;
        while ((line = reader.readLine()) != null) {
          System.out.println("Downloading " + url + ": " + line + " in thread " + Thread.currentThread().getName());
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
