(ns code-test.core-test
  (:require [clojure.test :refer :all]
            [code-test.core :refer :all]))

(deftest a-test

  (testing (is (= (isValid "")false)))
  (testing (is (= (isValid "(")false)))
  (testing (is (= (isValid "()")true)))
  (testing (is (= (isValid "()[]{}") true)))
  (testing (is (= (isValid "(]") false)))
  (testing (is (= (isValid "([)]") false)))
  (testing (is (= (isValid "{[]}") true)))
  (testing (is (= (isValid "{[}]()") false)))




  )


