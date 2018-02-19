(ns fiter8.core
  (:require [reagent.core :as reagent]
            [re-frame.core :as re-frame]
            [fiter8.events]
            [fiter8.subs]
            [fiter8.views :as views]
            [fiter8.config :as config]))

(enable-console-print!)

(defn dev-setup []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode")))

(defn mount-root []
  (re-frame/clear-subscription-cache!)
  (reagent/render [views/main-panel]
                  (.getElementById js/document "app")))

(defn render []
  (re-frame/dispatch-sync [:initialize-db])
  (dev-setup)
  (mount-root))
