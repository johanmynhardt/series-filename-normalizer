(ns series-filename-normaliser.core)

(def wd (clojure.java.io/file "/home/johan/Videos/series/Shameless/Season 4"))

(defn list-files
  [dir]
  (filter #(.getName %) (.listFiles dir)))

(defn to-upper
  [input]
  "convert input to uppercase"
  (.toUpperCase input))

(defn replace-strings [input & replacement]
  (println (str "Replacing using items: " replacement))
  (let [rep (partition 2 replacement)]
    (reduce #(apply clojure.string/replace %1 %2) input rep)))
