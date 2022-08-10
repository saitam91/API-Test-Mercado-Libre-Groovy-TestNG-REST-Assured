
import io.restassured.response.Response
import org.apache.log4j.LogManager
import org.apache.log4j.Logger
import org.testng.annotations.Test

import static io.restassured.RestAssured.get
import static org.junit.Assert.assertTrue

class TestMELI extends BaseMELI{

    private static final Logger log = LogManager.getLogger(TestMELI.class);

    @Test(groups = "TestMeli",dataProvider="DataContainer", dataProviderClass = BaseMELI.class)
    public void criteriaMatchesWithResult(String searchCriteria) {
        Response response=get("/sites/MLA/search?q="+searchCriteria)
        String [] resultSearch = response.path("results.title")

       String[] criteria = searchCriteria.split(" ");
        for (int i = 0; i < resultSearch.length; i++) {
            for (int  j= 0; j < criteria.length; j++){
           Boolean upperCaseResultSearch = resultSearch[i].contains(criteria[j].substring(0, 1).toUpperCase() + criteria[j].substring(1));
           Boolean lowerCaseResultSearch = resultSearch[i].contains(criteria[j].substring(0, 1).toLowerCase() + criteria[j].substring(1));
                       assertTrue("The result search "+resultSearch[i]+" not match with the search criteria: "+criteria[j],(upperCaseResultSearch || lowerCaseResultSearch));
                       log.info("The result search "+resultSearch[i]+" matches with the search criteria: "+criteria[j]);
            }
            }

}
}