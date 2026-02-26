package mailTest;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMessage.RecipientType;
import javax.mail.internet.MimeMultipart;

public class MailTest {
   public static void main(String[] args) {
         // 메일 인코딩
          final String bodyEncoding = "UTF-8"; //콘텐츠 인코딩
          
          //원하는 메일 제목 작성
          String subject = "너는나를존중해야한다.";
          
          //보낸 이메일 작성
          String fromEmail = "oasis0031@gmail.com";
          String fromUsername = "oasis0031@gmail.com";
          
          String toEmail = "oasis0031@gmail.com"; // 콤마(,)로 여러개 나열
          
          //도메인 사용할 필요 없다
          //앱비밀번호
          final String username = "oasis0031@gmail.com";         
          final String password = "uewc vfbl hvrp lolo";
          
          // 메일에 출력할 텍스트
          String html = null;
          StringBuffer sb = new StringBuffer();
          sb.append("<h3>[web발신]</h3>\n");
          sb.append("<h4>너는나를존중해야한다나는발롱도르5개와수많은개인트로피를들어올렸으며2016유로에서포르투갈을이끌고우승을차지했고동시에A매치역대최다득점자이다또한챔스역대최다득점자이자5번이나우승을차지한레알마드리드의상징이다또한36세의나이에도프리미어리그에서18골을기록하고챔스에서5경기연속골을기록하며내가세계최고임을증명해냈다은혜를모르는맨유보드진과팬들은내가맨유의골칫덩이라며쫓아냈지만내가세계최고이고내가팀보다위대하다는사실은바뀌지않는다내가사우디에간이유는메시에대한자격지심이아니라유럽에서이룰수있는모든것을이루었기에아시아를정복하기위해간것이지단지돈을위해서간것이아니다</h4>\n");    
          html = sb.toString();
          
          // 메일 옵션 설정
          Properties props = new Properties();    
          props.put("mail.smtp.starttls.enable", "true");
          props.put("mail.smtp.host", "smtp.gmail.com");
          props.put("mail.smtp.auth", "true");
          props.put("mail.smtp.port", "587");
          props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
          props.put("mail.smtp.ssl.protocols", "TLSv1.2");
          
          try {
            // 메일 서버  인증 계정 설정
            Authenticator auth = new Authenticator() {
              protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
              }
            };
            
            // 메일 세션 생성
            Session session = Session.getDefaultInstance(props, auth);
            
            // 메일 송/수신 옵션 설정
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail, fromUsername));
            message.setRecipients(RecipientType.TO, InternetAddress.parse(toEmail, false));
            message.setSubject(subject);
            message.setSentDate(new Date());
            
//            // 메일 콘텐츠 설정
            Multipart mParts = new MimeMultipart();
            MimeBodyPart mTextPart = new MimeBodyPart();
            MimeBodyPart mFilePart = null;
   //    
//            // 메일 콘텐츠 - 내용
            mTextPart.setText(html, bodyEncoding, "html");
            mParts.addBodyPart(mTextPart);
//                  
//            // 메일 콘텐츠 설정
            message.setContent(mParts);
       
            // 메일 발송
            Transport.send( message );
            
          } catch ( Exception e ) {
            e.printStackTrace();
          }
   }
}
