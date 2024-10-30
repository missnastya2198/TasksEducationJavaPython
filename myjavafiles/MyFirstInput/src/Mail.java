import java.util.logging.Logger;

public class Mail {
}
interface Sendable {
    String getFrom();
    String getTo();
}
abstract class AbstractSendable implements Sendable {

    protected final String from;
    protected final String to;

    public AbstractSendable(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String getFrom() {
        return from;
    }

    @Override
    public String getTo() {
        return to;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractSendable that = (AbstractSendable) o;

        if (!from.equals(that.from)) return false;
        if (!to.equals(that.to)) return false;

        return true;
    }

}
class MailMessage extends AbstractSendable {

    private final String message;

    public MailMessage(String from, String to, String message) {
        super(from, to);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MailMessage that = (MailMessage) o;

        if (message != null ? !message.equals(that.message) : that.message != null) return false;

        return true;
    }

}
class MailPackage extends AbstractSendable {
    private final Package content;

    public MailPackage(String from, String to, Package content) {
        super(from, to);
        this.content = content;
    }

    public Package getContent() {
        return content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MailPackage that = (MailPackage) o;

        if (!content.equals(that.content)) return false;

        return true;
    }

}
class Package {
    private final String content;
    private final int price;

    public Package(String content, int price) {
        this.content = content;
        this.price = price;
    }

    public String getContent() {
        return content;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Package aPackage = (Package) o;

        if (price != aPackage.price) return false;
        if (!content.equals(aPackage.content)) return false;

        return true;
    }
}
/*
Интерфейс, который задает класс, который может каким-либо образом обработать почтовый объект.
*/
interface MailService {
    Sendable processMail(Sendable mail);
}

/*
Класс, в котором скрыта логика настоящей почты
*/
class RealMailService implements MailService {

    @Override
    public Sendable processMail(Sendable mail) {
        // Здесь описан код настоящей системы отправки почты.
       return mail;
    }
}
class UntrustworthyMailWorker implements MailService{
    private static MailService[] mailServices;
    private static RealMailService realMailService = new RealMailService();
    public UntrustworthyMailWorker (MailService[] services){
        //System.out.println(mailServices);
        mailServices = services;

    }
    public MailService getRealMailService(){
        //System.out.println(realMailService);
        return realMailService;
    }
    @Override
    public Sendable processMail(Sendable mail){
        Sendable processed = mail;
        for (int i = 0; i < mailServices.length; i++) {
            processed = mailServices[i].processMail(processed);
            //System.out.println("цикл" + mailServices[i] + processed);
        }
        return realMailService.processMail(mail);
    }
}

class Spy implements MailService{
    private Logger LOGGER;
    public Spy(Logger logger) {

        LOGGER = logger;

    }
    @Override
    public Sendable processMail(Sendable mail){
        if(mail.getClass() == MailMessage.class) {
            MailMessage mailMessage = (MailMessage) mail;
            String from = mailMessage.getFrom();
            //System.out.println(from);
            String to = mailMessage.getTo();
            if (from.equals("AUSTIN_POWERS") || to.equals("AUSTIN_POWERS")) {                     // знак || важен
                LOGGER.warning("Detected target mail correspondence: from " + from + " to " + to + " \"" + mailMessage.getMessage() + "\"");
            } else {
                LOGGER.info("Usual correspondence: from " + from + " to " + to + "");
            }
        }
        return mail;
    }
}
/*public static class Spy implements MailService {

private Logger LOGGER;

public Spy(Logger logger) {

LOGGER = logger;

}

@Override

public Sendable processMail(Sendable mail) {

if(mail.getClass() == MailMessage.class) {

MailMessage mailMessage = (MailMessage) mail;

String from = mailMessage.getFrom();

String to = mailMessage.getTo();

if (from.equals(AUSTIN_POWERS) || to.equals(AUSTIN_POWERS)) {

LOGGER.warning("Detected target mail correspondence: from " + from + " to " + to + " \"" + mailMessage.getMessage() + "\"");

} else {

LOGGER.info("Usual correspondence: from " + from + " to " + to + "");

}

}

return mail;

}

}*/

class Thief implements MailService{
    private int minPrice;
    private int stolenPrice = 0;

    public Thief(int minPrice) {
        this.minPrice = minPrice;
    }
    public int getStolenValue(){
        return stolenPrice;
    }
    @Override
    public Sendable processMail(Sendable mail){
        Sendable processed = mail;
        if(mail.getClass()== MailPackage.class){
            Package pac = ((MailPackage)mail).getContent();
            if (pac.getPrice() >= minPrice){
                stolenPrice += pac.getPrice();
                mail = new MailPackage(mail.getFrom(), mail.getTo(), new Package("stones instead of " + pac.getContent(), 0));
            }
        }
        return mail;
    }

}
class IllegalPackageException extends RuntimeException {}

class StolenPackageException extends RuntimeException {}
class Inspector implements MailService{
    @Override
    public Sendable processMail(Sendable mail){
        Sendable processed = mail;
        if(mail.getClass()== MailPackage.class){
            Package pac = ((MailPackage)mail).getContent();
            if (pac.getContent().equals("weapons")|pac.getContent().equals("banned substance")) {
                throw new IllegalPackageException();
            }
            else if (pac.getContent().contains("stones") == true){
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}