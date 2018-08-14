(ns web.core
  (:require [org.httpkit.server :as s]
            [ring.middleware.defaults :refer :all]
            [compojure.core :refer [defroutes POST GET ANY]]))


(defn insert-into-db [req]
  (println "AAS" (:params req)))


(defroutes app
  (GET "/" [] "YO")
  (POST "/post" req
    (println "body" (slurp (:body req)))))

(defn -main []
  (s/run-server app {:port 8083}))