(ns hello-world.handler-test
  (:require [expectations :refer :all]
            [expectations.clojure.test :refer [defexpect]]
            [ring.mock.request :as mock]
            [hello-world.handler :refer :all]))

(let [response (app (mock/request :get "/"))]
  (defexpect main-route
    (expect 200 (:status response))
    (expect "Hello World" (:body response))))

(let [response (app (mock/request :get "/invalid"))]
  (defexpect not-found-route
    (expect 404 (:status response))))
