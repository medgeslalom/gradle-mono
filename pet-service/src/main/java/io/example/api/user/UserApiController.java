package io.example.api.user;

import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

@Controller
@RequestMapping("${openapi.userAPIs.base-path:}")
public class UserApiController implements UserApi {

  private final NativeWebRequest request;

  @org.springframework.beans.factory.annotation.Autowired
  public UserApiController(NativeWebRequest request) {
    this.request = request;
  }

  @Override
  public Optional<NativeWebRequest> getRequest() {
    return Optional.ofNullable(request);
  }
}
