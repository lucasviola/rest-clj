(ns hello-world.handler
  (:require [compojure.api.sweet :as compojure]
            [ring.util.http-response :as http]
            [compojure.route :as route]))

(def app
  (compojure/api
    (compojure/context "" []
      (compojure/GET "/" []
        (http/ok "Hello World")))
      (route/not-found "Not Found")))
