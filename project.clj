(defproject web "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [http-kit "2.2.0"]
                 [compojure "1.6.0"]
                 [org.clojure/java.jdbc "0.7.8"]
                 [org.postgresql/postgresql "42.2.2"]
                 [ring/ring-defaults "0.1.1"]
                 [org.apache.kafka/kafka-clients "1.1.0"]
                 [org.clojure/tools.logging "0.4.0"]
                 [org.slf4j/log4j-over-slf4j "1.7.25"]
                 [org.apache.curator/curator-test "2.8.0"]
                 [org.apache.kafka/kafka_2.11 "1.0.0"
                  :exclusions [org.slf4j/slf4j-log4j12
                               log4j/log4j]]
                 [me.raynes/fs "1.4.6"]])
