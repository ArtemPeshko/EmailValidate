
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmailValidatorTest {

    private EmailValidator emailValidator;

    @BeforeClass
    public void initData() {
        emailValidator = new EmailValidator();
    }

    @DataProvider
    public Object[][] ValidEmailProvider() {
        return new Object[][]{
                {
                        new String[]{
                                "shturo@gmail.com",
                                "shturo@gmail.123",
                                "shturo@gmail.test",
                                "@gmail.com",
                                "mikhail.shtura@gmail.com",
                                "mikhail.shtura@gmail",
                                "mikhail_shtura@gmail.com",
                                "mikhail_shtura@.com",
                                "mikhail_voitehovich_shtura@gmail.com",
                                "mikhail_voitehovich_shturagmail.com",
                                "mikhail.voitehovich.shtura@gmail.com",
                                "mikhail_voitehovich.shtura@gmail.com",
                                "mikhail.voitehovich_shtura@gmail.com",
                                "mikhail.voitehovich_shtura@gmail.рф"
                        }
                }
        };
    }

    @Test(dataProvider = "ValidEmailProvider")
    public void ValidEmailTest(String[] Email) {

        for (String temp : Email) {
            boolean valid = emailValidator.validate(temp);
            if (valid) {
                System.out.println("Email: " + temp + " -> " + true);
            }else{
                System.out.println("Email: " + temp + " -> " + false);
            }
        }
    }
}
