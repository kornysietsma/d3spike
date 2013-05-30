(ns d3spike.core
  (:require [compojure.core :refer :all]
            [compojure.handler :as handler]
            [compojure.route :as route]
            [ring.util.response :as resp]
            [ring.middleware.json :as json]))

(defroutes app-routes
  (GET "/" [] (resp/file-response "index.html" {:root "static"}))
  (route/files "/" {:root "static"})
  (route/not-found "<h1>Page not found</h1>"))

(def app
  (-> (handler/api app-routes)
    (json/wrap-json-body {:keywords? true})))


