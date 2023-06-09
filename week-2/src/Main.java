import cars.*;
import customers.*;
import services.RentService;

public class Main {
    public static void main(String[] args) {
        // Sanki bir siteye üye oluyormuş gibi Şirket veya Bireysel kullanıcı bilgilerimizi giriyoruz.
        Company company = new Company(
                1,
                "Code16",
                "info@code16.net",
                "********",
                "1234567890"
        );
        Person person = new Person(
                1,
                "Kerem",
                "kerem@mail.com",
                "********",
                "12345678901"
        );
        // 3 Farklı model aracı bilgi olarak tutmak için nesnelerini oluşturuyoruz.
        SUV suv = new SUV(
                500,
                "Red"
        );
        Sedan sedan = new Sedan(
                300,
                "Blue",
                3
        );
        Hatchback hatchback = new Hatchback(
                350,
                "Black"
        );

        // Farklı kullanımları buradan görebiliriz
        RentService rentServicePersonDaily, rentServicePersonMonthly;
        rentServicePersonDaily = new RentService(person, hatchback, "gunluk");
        rentServicePersonMonthly = new RentService(person, hatchback, "aylik");

        RentService rentServiceCompanyDaily, rentServiceCompanyMonthly;
        rentServiceCompanyDaily = new RentService(company, suv, "gunluk");
        rentServiceCompanyMonthly = new RentService(company, sedan, "aylik");






    }
}