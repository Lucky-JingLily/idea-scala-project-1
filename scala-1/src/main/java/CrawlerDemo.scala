import java.io.FileOutputStream
import java.net.URL

object CrawlerDemo {
  def main(args: Array[String]): Unit = {
    val url = new URL("https://www.ivsky.com/bizhi/maomi_laoshi_v56954/pic_890085.html");
    val conn = url.openConnection();
    val in = conn.getInputStream
    val out = new FileOutputStream("D://1.html");
    var len = 0 ;
    //创建数组字节
    val buf = new Array[Byte](in.available());

    out.write(buf);
//    while((len = in.read(buf)) != -1){
//        out.write(buf,0,len);
//    }
    out.close()
    in.close();


  }
}