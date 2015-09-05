(ns series-filename-normaliser.core-test
  (:require [clojure.test :refer :all]
            [series-filename-normaliser.fs :refer :all :as fs]
            [series-filename-normaliser.str-util :refer :all :as str-util]))

(deftest test-to-upper
  (testing "Not to upper"
    (is (= (str-util/to-upper "hello, world") "HELLO, WORLD"))))

(deftest test-replace-strings
  (testing "Replacing of strings failed"
    (is (= (str-util/replace-strings "FwwBeir (" "w" "o" "i" "a" " (" ".") "FooBear."))))

(deftest test-list-files
  (let [wdir wd]
    (println (fs/list-files wdir))))
