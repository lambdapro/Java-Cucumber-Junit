
## Setup
* Clone the repo
* Install dependencies `mvn install`
* Set environment variables with your LT_USERNAME & LT_ACCESS_KEY
* Update `*.conf.js` files inside the `src/test/resources/conf/` directory to update desired capabilities.

## Running your tests
* To run a single test, run `mvn test -P single`
* To run parallel tests/features, run `mvn test -P parallel` 


  ```
  export LT_USERNAME=<LT-username> &&
  export LT_ACCESS_KEY=<LT-access-key>
  ```
