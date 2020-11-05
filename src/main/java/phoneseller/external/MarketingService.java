
package phoneseller.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="marketing", url="${api.url.marketing}")
public interface MarketingService {

    @RequestMapping(method= RequestMethod.POST, path="/marketings")
    public void payCancel(@RequestBody Marketing marketing);

}