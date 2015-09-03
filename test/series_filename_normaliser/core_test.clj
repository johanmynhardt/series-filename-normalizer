(ns series-filename-normaliser.core-test
  (:require [clojure.test :refer :all]
            [series-filename-normaliser.core :refer :all :as sfn]))

(deftest test-to-upper
  (testing "Not to upper"
    (is (= (series-filename-normaliser.core/to-upper "hello, world") "HELLO, WORLD"))))

(deftest test-replace-strings
  (testing "Replacing of strings failed"
    (is (= (sfn/replace-strings "FwwBeir (" "w" "o" "i" "a" " (" ".") "FooBear."))))

(deftest test-list-files
  (let [wd sfn/wd]
    (println (sfn/list-files wd))
    ))
; (defn list-files
;   [dir]
;   (filter #(.name %) (.listFiles dir)))
