(ns fiter8.test-runner
  (:require
   [doo.runner :refer-macros [doo-tests]]
   [fiter8.core-test]
   [fiter8.common-test]))

(enable-console-print!)

(doo-tests 'fiter8.core-test
           'fiter8.common-test)
