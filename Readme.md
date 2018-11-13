## extentreports-cucumber3-adapter

### Docs

See [here](http://extentreports.com/docs/versions/4/java/cucumber3.html) for complete docs.

See `src/test` for examples.

### Usage

To begin using the adapter, add the com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter plugin to the runner.

```java
`@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunCukesTest {
	// ..
}
```

### License

extentreports-cucumber3-adapter is MIT licensed.
