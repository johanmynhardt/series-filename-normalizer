(ns series-filename-normaliser.core-test
  (:require [clojure.test :refer :all]
            [series-filename-normaliser.fs :refer :all :as fs]
            [series-filename-normaliser.str-util :refer :all :as str-util]
            [series-filename-normaliser.fs-util :refer :all :as fs-util])
  (:import (java.io File)))

(deftest test-to-upper
  (testing "Not to upper"
    (is (= (str-util/to-upper "hello, world") "HELLO, WORLD"))))

(deftest test-replace-strings
  (testing "Replacing of strings failed"
    (is (= (str-util/replace-strings "FwwBeir (" "w" "o" "i" "a" " (" ".") "FooBear."))))

(deftest test-list-files-with-space
  (println (fs/list-files wd fs-util/contains-space?)))

(deftest test-list-files-with-open-parenthesis
  (println (fs/list-files wd fs-util/contains-open-parenthesis?)))

(deftest test-list-files-with-mp4
  (let [result (fs/list-files wd #(fs-util/contains-char? % ".mp4"))]
    (println (str "items containing .mp4: " (count result)))))

(deftest test-move-file
  (let [src (File/createTempFile "clojure" " some filename end")]
    (fs/move-file src rename-fn-replace-spaces)))