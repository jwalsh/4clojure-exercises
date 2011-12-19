(ns exercises-4clojure.test.core
  (:use [exercises-4clojure.core])
  (:use [clojure.test]))



(deftest can-nth-element
(is (= (nth-element-solution '(4 5 6 7) 2) 6) " (= (nth-element-solution '(4 5 6 7) 2) 6) " )
(is (= (nth-element-solution [:a :b :c] 0) :a) " (= (nth-element-solution [:a :b :c] 0) :a) " )
(is (= (nth-element-solution [1 2 3 4] 1) 2) " (= (nth-element-solution [1 2 3 4] 1) 2) " )
(is (= (nth-element-solution '([1 2] [3 4] [5 6]) 2) [5 6]) " (= (nth-element-solution '([1 2] [3 4] [5 6]) 2) [5 6]) " )
)

(deftest can-penultimate-element
(is (= (penultimate-element-solution (list 1 2 3 4 5)) 4) " (= (penultimate-element-solution (list 1 2 3 4 5)) 4) " )
(is (= (penultimate-element-solution ["a" "b" "c"]) "b") " (= (penultimate-element-solution [\"a\" \"b\" \"c\"]) \"b\") " )
(is (= (penultimate-element-solution [[1 2] [3 4]]) [1 2]) " (= (penultimate-element-solution [[1 2] [3 4]]) [1 2]) " )
)

(deftest can-implement-range
(is (= (implement-range-solution 1 4) '(1 2 3)) " (= (implement-range-solution 1 4) '(1 2 3)) " )
(is (= (implement-range-solution -2 2) '(-2 -1 0 1)) " (= (implement-range-solution -2 2) '(-2 -1 0 1)) " )
(is (= (implement-range-solution 5 8) '(5 6 7)) " (= (implement-range-solution 5 8) '(5 6 7)) " )
)

(deftest can-palindrome-detector
(is (false? (palindrome-detector-solution '(1 2 3 4 5))) " (false? (palindrome-detector-solution '(1 2 3 4 5))) " )
(is (true? (palindrome-detector-solution "racecar")) " (true? (palindrome-detector-solution \"racecar\")) " )
(is (true? (palindrome-detector-solution [:foo :bar :foo])) " (true? (palindrome-detector-solution [:foo :bar :foo])) " )
(is (true? (palindrome-detector-solution '(1 1 3 3 1 1))) " (true? (palindrome-detector-solution '(1 1 3 3 1 1))) " )
(is (false? (palindrome-detector-solution '(:a :b :c))) " (false? (palindrome-detector-solution '(:a :b :c))) " )
)

(deftest can-duplicate-a-sequence
(is (= (duplicate-a-sequence-solution [1 2 3]) '(1 1 2 2 3 3)) " (= (duplicate-a-sequence-solution [1 2 3]) '(1 1 2 2 3 3)) " )
(is (= (duplicate-a-sequence-solution [:a :a :b :b]) '(:a :a :a :a :b :b :b :b)) " (= (duplicate-a-sequence-solution [:a :a :b :b]) '(:a :a :a :a :b :b :b :b)) " )
(is (= (duplicate-a-sequence-solution [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])) " (= (duplicate-a-sequence-solution [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])) " )
(is (= (duplicate-a-sequence-solution [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])) " (= (duplicate-a-sequence-solution [[1 2] [3 4]]) '([1 2] [1 2] [3 4] [3 4])) " )
)

(deftest can-factorial-fun
(is (= (factorial-fun-solution 1) 1) " (= (factorial-fun-solution 1) 1) " )
(is (= (factorial-fun-solution 3) 6) " (= (factorial-fun-solution 3) 6) " )
(is (= (factorial-fun-solution 5) 120) " (= (factorial-fun-solution 5) 120) " )
(is (= (factorial-fun-solution 8) 40320) " (= (factorial-fun-solution 8) 40320) " )
)
