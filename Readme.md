[![Maven Central](https://img.shields.io/maven-central/v/com.aventstack/extentreports-cucumber3-adapter.svg?maxAge=300)](http://search.maven.org/#search|ga|1|g:"com.aventstack")

## Extent Framework Cucumber3 Adapter

### Docs

See [here](http://extentreports.com/docs/versions/4/java/cucumber3.html) for complete docs.

See `src/test` for examples.

### Usage

To begin using the adapter, add the com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter plugin to the runner.

```java
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class RunCukesTest {
	// ..
}
```

### License

MIT license
