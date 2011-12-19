(ns exercises-4clojure.test.core
  (:use [exercises-4clojure.core])
  (:use [clojure.test]))



(deftest can-nth-element
(is (= (nth-element-solution '(4 5 6 7) 2) 6) " (= (nth-element-solution '(4 5 6 7) 2) 6) " )
(is (= (nth-element-solution [:a :b :c] 0) :a) " (= (nth-element-solution [:a :b :c] 0) :a) " )
(is (= (nth-element-solution [1 2 3 4] 1) 2) " (= (nth-element-solution [1 2 3 4] 1) 2) " )
(is (= (nth-element-solution '([1 2] [3 4] [5 6]) 2) [5 6]) " (= (nth-element-solution '([1 2] [3 4] [5 6]) 2) [5 6]) " )
)
