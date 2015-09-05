(ns series-filename-normaliser.str-util
  (:require clojure.string replace))

(defn to-upper
  [input]
  "convert input to uppercase"
  (.toUpperCase input))

(defn replace-strings [input & replacement]
  (println (str "Replacing using items: " replacement))
  (let [rep (partition 2 replacement)]
    (reduce #(apply replace %1 %2) input rep)))
