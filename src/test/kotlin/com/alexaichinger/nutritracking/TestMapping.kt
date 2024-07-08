package com.alexaichinger.nutritracking

import com.alexaichinger.nutritracking.dto.external.open.food.facts.v3.Off3Dto
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import kotlin.test.Test

class TestMapping {

    @Test
    fun test() {
        var mapper = jacksonObjectMapper()
        val maped = mapper.readValue<Off3Dto>(body)

    }

    val body = """
{
  "code": "3045320094008",
  "errors": [],
  "product": {
    "_id": "3045320094008",
    "_keywords": [
      "and",
      "based",
      "berry",
      "beverage",
      "bonne",
      "breakfast",
      "food",
      "fruit",
      "gluten",
      "jam",
      "maman",
      "no",
      "plant-based",
      "preserve",
      "spread",
      "strawberry",
      "sweet",
      "vegetable"
    ],
    "added_countries_tags": [],
    "additives_n": 1,
    "additives_original_tags": [
      "en:e440"
    ],
    "additives_tags": [
      "en:e440"
    ],
    "allergens": "",
    "allergens_from_ingredients": "",
    "allergens_from_user": "(fr) ",
    "allergens_hierarchy": [],
    "allergens_lc": "fr",
    "allergens_tags": [],
    "amino_acids_prev_tags": [],
    "amino_acids_tags": [],
    "brands": "Bonne Maman",
    "brands_tags": [
      "bonne-maman"
    ],
    "categories": "Plant-based foods and beverages, Plant-based foods, Fruits and vegetables based foods, Breakfasts, Spreads, Fruits based foods, Plant-based spreads, Sweet spreads, Fruit and vegetable preserves, Jams, Berry jams, Strawberry jams",
    "categories_hierarchy": [
      "en:plant-based-foods-and-beverages",
      "en:plant-based-foods",
      "en:fruits-and-vegetables-based-foods",
      "en:breakfasts",
      "en:spreads",
      "en:fruits-based-foods",
      "en:plant-based-spreads",
      "en:sweet-spreads",
      "en:fruit-and-vegetable-preserves",
      "en:jams",
      "en:berry-jams",
      "en:strawberry-jams"
    ],
    "categories_lc": "en",
    "categories_old": "Plant-based foods and beverages, Plant-based foods, Fruits and vegetables based foods, Breakfasts, Spreads, Fruits based foods, Plant-based spreads, Sweet spreads, Fruit and vegetable preserves, Jams, Berry jams, Strawberry jams",
    "categories_properties": {
      "agribalyse_food_code:en": "31024",
      "agribalyse_proxy_food_code:en": "31024",
      "ciqual_food_code:en": "31024"
    },
    "categories_properties_tags": [
      "all-products",
      "categories-known",
      "agribalyse-food-code-31024",
      "agribalyse-food-code-known",
      "agribalyse-proxy-food-code-31024",
      "agribalyse-proxy-food-code-known",
      "ciqual-food-code-31024",
      "ciqual-food-code-known",
      "agribalyse-known",
      "agribalyse-31024"
    ],
    "categories_tags": [
      "en:plant-based-foods-and-beverages",
      "en:plant-based-foods",
      "en:fruits-and-vegetables-based-foods",
      "en:breakfasts",
      "en:spreads",
      "en:fruits-based-foods",
      "en:plant-based-spreads",
      "en:sweet-spreads",
      "en:fruit-and-vegetable-preserves",
      "en:jams",
      "en:berry-jams",
      "en:strawberry-jams"
    ],
    "category_properties": {
      "ciqual_food_name:en": "Jam, strawberry",
      "ciqual_food_name:fr": "Confiture de fraise -extra ou classique-"
    },
    "checkers_tags": [],
    "ciqual_food_name_tags": [
      "jam-strawberry"
    ],
    "cities_tags": [],
    "code": "3045320094008",
    "codes_tags": [
      "code-13",
      "3045320094xxx",
      "304532009xxxx",
      "30453200xxxxx",
      "3045320xxxxxx",
      "304532xxxxxxx",
      "30453xxxxxxxx",
      "3045xxxxxxxxx",
      "304xxxxxxxxxx",
      "30xxxxxxxxxxx",
      "3xxxxxxxxxxxx"
    ],
    "compared_to_category": "en:strawberry-jams",
    "complete": 0,
    "completeness": 0.8875,
    "correctors_tags": [
      "tacinte",
      "kiliweb",
      "yukafix",
      "yuka.SG9VL08vVXFwNklWbHNFYTJEekxwZmhaMnB5NUJYMnBJY1lJSWc9PQ",
      "inf",
      "swipe-studio",
      "walterppk",
      "torredibabele",
      "packbot",
      "sebleouf",
      "macrofactor",
      "factfinds"
    ],
    "countries": "France,Suisse,Royaume-Uni",
    "countries_hierarchy": [
      "en:france",
      "en:switzerland",
      "en:united-kingdom"
    ],
    "countries_lc": "fr",
    "countries_tags": [
      "en:france",
      "en:switzerland",
      "en:united-kingdom"
    ],
    "created_t": 1409338638,
    "creator": "tacinte",
    "data_quality_bugs_tags": [],
    "data_quality_errors_tags": [],
    "data_quality_info_tags": [
      "en:packaging-data-incomplete",
      "en:ingredients-percent-analysis-ok",
      "en:missing-specific-ingredient-for-this-category",
      "en:ecoscore-extended-data-not-computed",
      "en:food-groups-1-known",
      "en:food-groups-2-known",
      "en:food-groups-3-unknown"
    ],
    "data_quality_tags": [
      "en:packaging-data-incomplete",
      "en:ingredients-percent-analysis-ok",
      "en:missing-specific-ingredient-for-this-category",
      "en:ecoscore-extended-data-not-computed",
      "en:food-groups-1-known",
      "en:food-groups-2-known",
      "en:food-groups-3-unknown",
      "en:ecoscore-origins-of-ingredients-origins-are-100-percent-unknown",
      "en:ecoscore-packaging-unscored-shape",
      "en:ecoscore-production-system-no-label"
    ],
    "data_quality_warnings_tags": [
      "en:ecoscore-origins-of-ingredients-origins-are-100-percent-unknown",
      "en:ecoscore-packaging-unscored-shape",
      "en:ecoscore-production-system-no-label"
    ],
    "data_sources": "App - yuka, Apps, App - Horizon, App - InFood, App - macrofactor, App - smoothie-openfoodfacts",
    "data_sources_tags": [
      "app-yuka",
      "apps",
      "app-horizon",
      "app-infood",
      "app-macrofactor",
      "app-smoothie-openfoodfacts"
    ],
    "debug_param_sorted_langs": [
      "en"
    ],
    "ecoscore_data": {
      "adjustments": {
        "origins_of_ingredients": {
          "aggregated_origins": [
            {
              "epi_score": "0",
              "origin": "en:unknown",
              "percent": 100,
              "transportation_score": null
            }
          ],
          "epi_score": 0,
          "epi_value": -5,
          "origins_from_categories": [
            "en:unknown"
          ],
          "origins_from_origins_field": [
            "en:unknown"
          ],
          "transportation_score": 0,
          "transportation_scores": {
            "ad": 0,
            "al": 0,
            "at": 0,
            "ax": 0,
            "ba": 0,
            "be": 0,
            "bg": 0,
            "ch": 0,
            "cy": 0,
            "cz": 0,
            "de": 0,
            "dk": 0,
            "dz": 0,
            "ee": 0,
            "eg": 0,
            "es": 0,
            "fi": 0,
            "fo": 0,
            "fr": 0,
            "gg": 0,
            "gi": 0,
            "gr": 0,
            "hr": 0,
            "hu": 0,
            "ie": 0,
            "il": 0,
            "im": 0,
            "is": 0,
            "it": 0,
            "je": 0,
            "lb": 0,
            "li": 0,
            "lt": 0,
            "lu": 0,
            "lv": 0,
            "ly": 0,
            "ma": 0,
            "mc": 0,
            "md": 0,
            "me": 0,
            "mk": 0,
            "mt": 0,
            "nl": 0,
            "no": 0,
            "pl": 0,
            "ps": 0,
            "pt": 0,
            "ro": 0,
            "rs": 0,
            "se": 0,
            "si": 0,
            "sj": 0,
            "sk": 0,
            "sm": 0,
            "sy": 0,
            "tn": 0,
            "tr": 0,
            "ua": 0,
            "uk": 0,
            "us": 0,
            "va": 0,
            "world": 0,
            "xk": 0
          },
          "transportation_value": 0,
          "transportation_values": {
            "ad": 0,
            "al": 0,
            "at": 0,
            "ax": 0,
            "ba": 0,
            "be": 0,
            "bg": 0,
            "ch": 0,
            "cy": 0,
            "cz": 0,
            "de": 0,
            "dk": 0,
            "dz": 0,
            "ee": 0,
            "eg": 0,
            "es": 0,
            "fi": 0,
            "fo": 0,
            "fr": 0,
            "gg": 0,
            "gi": 0,
            "gr": 0,
            "hr": 0,
            "hu": 0,
            "ie": 0,
            "il": 0,
            "im": 0,
            "is": 0,
            "it": 0,
            "je": 0,
            "lb": 0,
            "li": 0,
            "lt": 0,
            "lu": 0,
            "lv": 0,
            "ly": 0,
            "ma": 0,
            "mc": 0,
            "md": 0,
            "me": 0,
            "mk": 0,
            "mt": 0,
            "nl": 0,
            "no": 0,
            "pl": 0,
            "ps": 0,
            "pt": 0,
            "ro": 0,
            "rs": 0,
            "se": 0,
            "si": 0,
            "sj": 0,
            "sk": 0,
            "sm": 0,
            "sy": 0,
            "tn": 0,
            "tr": 0,
            "ua": 0,
            "uk": 0,
            "us": 0,
            "va": 0,
            "world": 0,
            "xk": 0
          },
          "value": -5,
          "values": {
            "ad": -5,
            "al": -5,
            "at": -5,
            "ax": -5,
            "ba": -5,
            "be": -5,
            "bg": -5,
            "ch": -5,
            "cy": -5,
            "cz": -5,
            "de": -5,
            "dk": -5,
            "dz": -5,
            "ee": -5,
            "eg": -5,
            "es": -5,
            "fi": -5,
            "fo": -5,
            "fr": -5,
            "gg": -5,
            "gi": -5,
            "gr": -5,
            "hr": -5,
            "hu": -5,
            "ie": -5,
            "il": -5,
            "im": -5,
            "is": -5,
            "it": -5,
            "je": -5,
            "lb": -5,
            "li": -5,
            "lt": -5,
            "lu": -5,
            "lv": -5,
            "ly": -5,
            "ma": -5,
            "mc": -5,
            "md": -5,
            "me": -5,
            "mk": -5,
            "mt": -5,
            "nl": -5,
            "no": -5,
            "pl": -5,
            "ps": -5,
            "pt": -5,
            "ro": -5,
            "rs": -5,
            "se": -5,
            "si": -5,
            "sj": -5,
            "sk": -5,
            "sm": -5,
            "sy": -5,
            "tn": -5,
            "tr": -5,
            "ua": -5,
            "uk": -5,
            "us": -5,
            "va": -5,
            "world": -5,
            "xk": -5
          },
          "warning": "origins_are_100_percent_unknown"
        },
        "packaging": {
          "non_recyclable_and_non_biodegradable_materials": 0,
          "packagings": [
            {
              "ecoscore_material_score": 81,
              "ecoscore_shape_ratio": 1,
              "material": "en:glass",
              "recycling": "en:recycle",
              "shape": "en:bottle"
            },
            {
              "ecoscore_material_score": 81,
              "ecoscore_shape_ratio": 1,
              "material": "en:glass",
              "shape": "en:jar"
            }
          ],
          "score": 62,
          "value": -4,
          "warning": "unscored_shape"
        },
        "production_system": {
          "labels": [],
          "value": 0,
          "warning": "no_label"
        },
        "threatened_species": {}
      },
      "agribalyse": {
        "agribalyse_food_code": "31024",
        "co2_agriculture": 0.32737262,
        "co2_consumption": 0.0066736979,
        "co2_distribution": 0.019437894,
        "co2_packaging": 0.52557377,
        "co2_processing": 0.25129964,
        "co2_total": 1.4171211319,
        "co2_transportation": 0.28676351,
        "code": "31024",
        "dqr": "3.16",
        "ef_agriculture": 0.14649409,
        "ef_consumption": 0.002442269,
        "ef_distribution": 0.0047895045,
        "ef_packaging": 0.055373026,
        "ef_processing": 0.039080907,
        "ef_total": 0.2717172325,
        "ef_transportation": 0.023537436,
        "is_beverage": 0,
        "name_en": "Jam, strawberry",
        "name_fr": "Confiture de fraise (extra ou classique)",
        "score": 80,
        "version": "3.1.1"
      },
      "grade": "b",
      "grades": {
        "ad": "b",
        "al": "b",
        "at": "b",
        "ax": "b",
        "ba": "b",
        "be": "b",
        "bg": "b",
        "ch": "b",
        "cy": "b",
        "cz": "b",
        "de": "b",
        "dk": "b",
        "dz": "b",
        "ee": "b",
        "eg": "b",
        "es": "b",
        "fi": "b",
        "fo": "b",
        "fr": "b",
        "gg": "b",
        "gi": "b",
        "gr": "b",
        "hr": "b",
        "hu": "b",
        "ie": "b",
        "il": "b",
        "im": "b",
        "is": "b",
        "it": "b",
        "je": "b",
        "lb": "b",
        "li": "b",
        "lt": "b",
        "lu": "b",
        "lv": "b",
        "ly": "b",
        "ma": "b",
        "mc": "b",
        "md": "b",
        "me": "b",
        "mk": "b",
        "mt": "b",
        "nl": "b",
        "no": "b",
        "pl": "b",
        "ps": "b",
        "pt": "b",
        "ro": "b",
        "rs": "b",
        "se": "b",
        "si": "b",
        "sj": "b",
        "sk": "b",
        "sm": "b",
        "sy": "b",
        "tn": "b",
        "tr": "b",
        "ua": "b",
        "uk": "b",
        "us": "b",
        "va": "b",
        "world": "b",
        "xk": "b"
      },
      "missing": {
        "labels": 1,
        "origins": 1,
        "packagings": 1
      },
      "missing_data_warning": 1,
      "previous_data": {
        "agribalyse": {
          "agribalyse_food_code": "31024",
          "agribalyse_proxy_food_code": "31024",
          "co2_agriculture": 0.4391425,
          "co2_consumption": 0.0047993021,
          "co2_distribution": 0.032692835,
          "co2_packaging": 0.54656517,
          "co2_processing": 0.24580915,
          "co2_total": 1.6271789,
          "co2_transportation": 0.35817,
          "code": "31024",
          "dqr": "3.16",
          "ef_agriculture": 0.41455559,
          "ef_consumption": 0.0024293397,
          "ef_distribution": 0.0091648653,
          "ef_packaging": 0.056809478,
          "ef_processing": 0.041272627,
          "ef_total": 0.55246032,
          "ef_transportation": 0.02822842,
          "is_beverage": 0,
          "name_en": "Jam, strawberry",
          "name_fr": "Confiture de fraise (extra ou classique)",
          "score": 50
        },
        "grade": "c",
        "score": 41
      },
      "score": 71,
      "scores": {
        "ad": 71,
        "al": 71,
        "at": 71,
        "ax": 71,
        "ba": 71,
        "be": 71,
        "bg": 71,
        "ch": 71,
        "cy": 71,
        "cz": 71,
        "de": 71,
        "dk": 71,
        "dz": 71,
        "ee": 71,
        "eg": 71,
        "es": 71,
        "fi": 71,
        "fo": 71,
        "fr": 71,
        "gg": 71,
        "gi": 71,
        "gr": 71,
        "hr": 71,
        "hu": 71,
        "ie": 71,
        "il": 71,
        "im": 71,
        "is": 71,
        "it": 71,
        "je": 71,
        "lb": 71,
        "li": 71,
        "lt": 71,
        "lu": 71,
        "lv": 71,
        "ly": 71,
        "ma": 71,
        "mc": 71,
        "md": 71,
        "me": 71,
        "mk": 71,
        "mt": 71,
        "nl": 71,
        "no": 71,
        "pl": 71,
        "ps": 71,
        "pt": 71,
        "ro": 71,
        "rs": 71,
        "se": 71,
        "si": 71,
        "sj": 71,
        "sk": 71,
        "sm": 71,
        "sy": 71,
        "tn": 71,
        "tr": 71,
        "ua": 71,
        "uk": 71,
        "us": 71,
        "va": 71,
        "world": 71,
        "xk": 71
      },
      "status": "known"
    },
    "ecoscore_grade": "b",
    "ecoscore_score": 71,
    "ecoscore_tags": [
      "b"
    ],
    "editors": [
      "tacinte"
    ],
    "editors_tags": [
      "bcatelin",
      "factfinds",
      "inf",
      "kiliweb",
      "macrofactor",
      "openfoodfacts-contributors",
      "packbot",
      "sebleouf",
      "swipe-studio",
      "tacinte",
      "torredibabele",
      "walterppk",
      "yuka.SG9VL08vVXFwNklWbHNFYTJEekxwZmhaMnB5NUJYMnBJY1lJSWc9PQ",
      "yukafix"
    ],
    "emb_codes": "",
    "emb_codes_20141016": "",
    "emb_codes_orig": "",
    "emb_codes_tags": [],
    "entry_dates_tags": [
      "2014-08-29",
      "2014-08",
      "2014"
    ],
    "expiration_date": "31/11/2015",
    "food_groups": "en:sweets",
    "food_groups_tags": [
      "en:sugary-snacks",
      "en:sweets"
    ],
    "fruits-vegetables-nuts_100g_estimate": 85,
    "generic_name": "Strawberry Jam",
    "generic_name_en": "Strawberry Jam",
    "id": "3045320094008",
    "image_front_small_url": "https://images.openfoodfacts.org/images/products/304/532/009/4008/front_en.14.200.jpg",
    "image_front_thumb_url": "https://images.openfoodfacts.org/images/products/304/532/009/4008/front_en.14.100.jpg",
    "image_front_url": "https://images.openfoodfacts.org/images/products/304/532/009/4008/front_en.14.400.jpg",
    "image_ingredients_small_url": "https://images.openfoodfacts.org/images/products/304/532/009/4008/ingredients_en.33.200.jpg",
    "image_ingredients_thumb_url": "https://images.openfoodfacts.org/images/products/304/532/009/4008/ingredients_en.33.100.jpg",
    "image_ingredients_url": "https://images.openfoodfacts.org/images/products/304/532/009/4008/ingredients_en.33.400.jpg",
    "image_nutrition_small_url": "https://images.openfoodfacts.org/images/products/304/532/009/4008/nutrition_en.32.200.jpg",
    "image_nutrition_thumb_url": "https://images.openfoodfacts.org/images/products/304/532/009/4008/nutrition_en.32.100.jpg",
    "image_nutrition_url": "https://images.openfoodfacts.org/images/products/304/532/009/4008/nutrition_en.32.400.jpg",
    "image_small_url": "https://images.openfoodfacts.org/images/products/304/532/009/4008/front_en.14.200.jpg",
    "image_thumb_url": "https://images.openfoodfacts.org/images/products/304/532/009/4008/front_en.14.100.jpg",
    "image_url": "https://images.openfoodfacts.org/images/products/304/532/009/4008/front_en.14.400.jpg",
    "images": {
      "1": {
        "sizes": {
          "100": {
            "h": 75,
            "w": 100
          },
          "400": {
            "h": 300,
            "w": 400
          },
          "full": {
            "h": 1944,
            "w": 2592
          }
        },
        "uploaded_t": 1409338639,
        "uploader": "tacinte"
      },
      "2": {
        "sizes": {
          "100": {
            "h": 75,
            "w": 100
          },
          "400": {
            "h": 300,
            "w": 400
          },
          "full": {
            "h": 1944,
            "w": 2592
          }
        },
        "uploaded_t": 1409338789,
        "uploader": "tacinte"
      },
      "3": {
        "sizes": {
          "100": {
            "h": 100,
            "w": 75
          },
          "400": {
            "h": 400,
            "w": 300
          },
          "full": {
            "h": 2592,
            "w": 1944
          }
        },
        "uploaded_t": 1409338792,
        "uploader": "tacinte"
      },
      "4": {
        "sizes": {
          "100": {
            "h": 100,
            "w": 75
          },
          "400": {
            "h": 400,
            "w": 300
          },
          "full": {
            "h": 2592,
            "w": 1944
          }
        },
        "uploaded_t": 1409338793,
        "uploader": "tacinte"
      },
      "5": {
        "sizes": {
          "100": {
            "h": 100,
            "w": 75
          },
          "400": {
            "h": 400,
            "w": 300
          },
          "full": {
            "h": 2666,
            "w": 2000
          }
        },
        "uploaded_t": 1418652752,
        "uploader": "tacinte"
      },
      "6": {
        "sizes": {
          "100": {
            "h": 100,
            "w": 75
          },
          "400": {
            "h": 400,
            "w": 300
          },
          "full": {
            "h": 2592,
            "w": 1944
          }
        },
        "uploaded_t": 1419404577,
        "uploader": "tacinte"
      },
      "7": {
        "sizes": {
          "100": {
            "h": 100,
            "w": 75
          },
          "400": {
            "h": 400,
            "w": 300
          },
          "full": {
            "h": 2592,
            "w": 1944
          }
        },
        "uploaded_t": 1419404592,
        "uploader": "tacinte"
      },
      "8": {
        "sizes": {
          "100": {
            "h": 100,
            "w": 75
          },
          "400": {
            "h": 400,
            "w": 300
          },
          "full": {
            "h": 3264,
            "w": 2448
          }
        },
        "uploaded_t": "1476465450",
        "uploader": "bcatelin"
      },
      "9": {
        "sizes": {
          "100": {
            "h": 100,
            "w": 75
          },
          "400": {
            "h": 400,
            "w": 300
          },
          "full": {
            "h": 3264,
            "w": 2448
          }
        },
        "uploaded_t": "1476465472",
        "uploader": "bcatelin"
      },
      "10": {
        "sizes": {
          "100": {
            "h": 100,
            "w": 75
          },
          "400": {
            "h": 400,
            "w": 300
          },
          "full": {
            "h": 4027,
            "w": 3024
          }
        },
        "uploaded_t": 1572103311,
        "uploader": "openfoodfacts-contributors"
      },
      "11": {
        "sizes": {
          "100": {
            "h": 100,
            "w": 75
          },
          "400": {
            "h": 400,
            "w": 300
          },
          "full": {
            "h": 4032,
            "w": 3024
          }
        },
        "uploaded_t": 1572103375,
        "uploader": "openfoodfacts-contributors"
      },
      "12": {
        "sizes": {
          "100": {
            "h": 100,
            "w": 75
          },
          "400": {
            "h": 400,
            "w": 300
          },
          "full": {
            "h": 4032,
            "w": 3024
          }
        },
        "uploaded_t": 1572103390,
        "uploader": "openfoodfacts-contributors"
      },
      "13": {
        "sizes": {
          "100": {
            "h": 100,
            "w": 70
          },
          "400": {
            "h": 400,
            "w": 279
          },
          "full": {
            "h": 1200,
            "w": 836
          }
        },
        "uploaded_t": 1574422954,
        "uploader": "kiliweb"
      },
      "front": {
        "geometry": "1487x1980-266-339",
        "imgid": "5",
        "normalize": "checked",
        "rev": "14",
        "sizes": {
          "100": {
            "h": 100,
            "w": 75
          },
          "200": {
            "h": 200,
            "w": 150
          },
          "400": {
            "h": 400,
            "w": 300
          },
          "full": {
            "h": 1980,
            "w": 1487
          }
        },
        "white_magic": "checked"
      },
      "front_en": {
        "geometry": "1487x1980-266-339",
        "imgid": "5",
        "normalize": "checked",
        "rev": "14",
        "sizes": {
          "100": {
            "h": 100,
            "w": 75
          },
          "200": {
            "h": 200,
            "w": 150
          },
          "400": {
            "h": 400,
            "w": 300
          },
          "full": {
            "h": 1980,
            "w": 1487
          }
        },
        "white_magic": "checked"
      },
      "ingredients": {
        "geometry": "1568x415-466-913",
        "imgid": "7",
        "normalize": "checked",
        "ocr": 1,
        "orientation": "0",
        "rev": "15",
        "sizes": {
          "100": {
            "h": 26,
            "w": 100
          },
          "200": {
            "h": 53,
            "w": 200
          },
          "400": {
            "h": 106,
            "w": 400
          },
          "full": {
            "h": 415,
            "w": 1568
          }
        },
        "white_magic": "checked"
      },
      "ingredients_en": {
        "angle": "0",
        "coordinates_image_size": "full",
        "geometry": "1212x457-535-1521",
        "imgid": "9",
        "normalize": "false",
        "rev": "33",
        "sizes": {
          "100": {
            "h": 38,
            "w": 100
          },
          "200": {
            "h": 75,
            "w": 200
          },
          "400": {
            "h": 151,
            "w": 400
          },
          "full": {
            "h": 457,
            "w": 1212
          }
        },
        "white_magic": "false",
        "x1": "535.8399169921876",
        "x2": "1747.5999169921874",
        "y1": "1521.5680041503906",
        "y2": "1978.5280041503906"
      },
      "nutrition_en": {
        "angle": "0",
        "coordinates_image_size": "full",
        "geometry": "0x0-0-0",
        "imgid": "13",
        "normalize": "false",
        "rev": "32",
        "sizes": {
          "100": {
            "h": 100,
            "w": 70
          },
          "200": {
            "h": 200,
            "w": 139
          },
          "400": {
            "h": 400,
            "w": 279
          },
          "full": {
            "h": 1200,
            "w": 836
          }
        },
        "white_magic": "false",
        "x1": "0",
        "x2": "0",
        "y1": "0",
        "y2": "0"
      }
    },
    "informers_tags": [
      "tacinte",
      "kiliweb",
      "yukafix",
      "openfoodfacts-contributors",
      "yuka.SG9VL08vVXFwNklWbHNFYTJEekxwZmhaMnB5NUJYMnBJY1lJSWc9PQ",
      "swipe-studio",
      "torredibabele",
      "macrofactor",
      "factfinds"
    ],
    "ingredients": [
      {
        "ciqual_food_code": "13014",
        "id": "en:strawberry",
        "is_in_taxonomy": 1,
        "percent_estimate": 60,
        "percent_max": 100,
        "percent_min": 20,
        "text": "strawberries",
        "vegan": "yes",
        "vegetarian": "yes"
      },
      {
        "ciqual_proxy_food_code": "31016",
        "id": "en:sugar",
        "is_in_taxonomy": 1,
        "percent_estimate": 20,
        "percent_max": 50,
        "percent_min": 0,
        "text": "sugar",
        "vegan": "yes",
        "vegetarian": "yes"
      },
      {
        "ciqual_proxy_food_code": "31016",
        "id": "en:cane-sugar",
        "is_in_taxonomy": 1,
        "percent_estimate": 10,
        "percent_max": 33.3333333333333,
        "percent_min": 0,
        "text": "cane sugar",
        "vegan": "yes",
        "vegetarian": "yes"
      },
      {
        "ciqual_food_code": "2028",
        "id": "en:concentrated-lemon-juice",
        "is_in_taxonomy": 1,
        "percent_estimate": 5,
        "percent_max": 25,
        "percent_min": 0,
        "text": "concentrated lemon juice",
        "vegan": "yes",
        "vegetarian": "yes"
      },
      {
        "id": "en:gelling-agent",
        "ingredients": [
          {
            "id": "en:fruit-pectin",
            "is_in_taxonomy": 1,
            "percent_estimate": 5,
            "percent_max": 20,
            "percent_min": 0,
            "text": "fruit pectin",
            "vegan": "yes",
            "vegetarian": "yes"
          }
        ],
        "is_in_taxonomy": 1,
        "percent_estimate": 5,
        "percent_max": 20,
        "percent_min": 0,
        "text": "gelling agent"
      }
    ],
    "ingredients_analysis": {},
    "ingredients_analysis_tags": [
      "en:palm-oil-free",
      "en:vegan",
      "en:vegetarian"
    ],
    "ingredients_debug": [
      "strawberries",
      ",",
      null,
      null,
      null,
      " sugar",
      ",",
      null,
      null,
      null,
      " cane sugar",
      ",",
      null,
      null,
      null,
      " concentrated lemon juice",
      ",",
      null,
      null,
      null,
      " gelling agent ",
      "(",
      "(",
      null,
      null,
      "fruit pectin)  "
    ],
    "ingredients_from_or_that_may_be_from_palm_oil_n": 0,
    "ingredients_from_palm_oil_n": 0,
    "ingredients_from_palm_oil_tags": [],
    "ingredients_hierarchy": [
      "en:strawberry",
      "en:fruit",
      "en:berries",
      "en:sugar",
      "en:added-sugar",
      "en:disaccharide",
      "en:cane-sugar",
      "en:concentrated-lemon-juice",
      "en:juice",
      "en:fruit-juice",
      "en:lemon-juice",
      "en:gelling-agent",
      "en:fruit-pectin",
      "en:e440a"
    ],
    "ingredients_ids_debug": [
      "strawberries",
      "sugar",
      "cane-sugar",
      "concentrated-lemon-juice",
      "gelling-agent",
      "fruit-pectin"
    ],
    "ingredients_lc": "en",
    "ingredients_n": 6,
    "ingredients_n_tags": [
      "6",
      "1-10"
    ],
    "ingredients_non_nutritive_sweeteners_n": 0,
    "ingredients_original_tags": [
      "en:strawberry",
      "en:sugar",
      "en:cane-sugar",
      "en:concentrated-lemon-juice",
      "en:gelling-agent",
      "en:fruit-pectin"
    ],
    "ingredients_percent_analysis": 1,
    "ingredients_sweeteners_n": 0,
    "ingredients_tags": [
      "en:strawberry",
      "en:fruit",
      "en:berries",
      "en:sugar",
      "en:added-sugar",
      "en:disaccharide",
      "en:cane-sugar",
      "en:concentrated-lemon-juice",
      "en:juice",
      "en:fruit-juice",
      "en:lemon-juice",
      "en:gelling-agent",
      "en:fruit-pectin",
      "en:e440a"
    ],
    "ingredients_text": "strawberries, sugar, cane sugar, concentrated lemon juice, gelling agent (fruit pectin)",
    "ingredients_text_debug": "strawberries, sugar, cane sugar, concentrated lemon juice, gelling agent (fruit pectin)  ",
    "ingredients_text_en": "strawberries, sugar, cane sugar, concentrated lemon juice, gelling agent (fruit pectin)",
    "ingredients_text_en_ocr_1574422954": "strawberries, sugar, cane sugar, concentrated lemon juice, gelling agent (fruit pectin)  ",
    "ingredients_text_en_ocr_1574422954_result": "strawberries, sugar, cane sugar, concentrated lemon juice, gelling agent (fruit pectin)",
    "ingredients_text_with_allergens": "strawberries, sugar, cane sugar, concentrated lemon juice, gelling agent (fruit pectin)",
    "ingredients_text_with_allergens_en": "strawberries, sugar, cane sugar, concentrated lemon juice, gelling agent (fruit pectin)",
    "ingredients_that_may_be_from_palm_oil_n": 0,
    "ingredients_that_may_be_from_palm_oil_tags": [],
    "ingredients_with_specified_percent_n": 0,
    "ingredients_with_specified_percent_sum": 0,
    "ingredients_with_unspecified_percent_n": 5,
    "ingredients_with_unspecified_percent_sum": 100,
    "ingredients_without_ciqual_codes": [
      "en:fruit-pectin",
      "en:gelling-agent"
    ],
    "ingredients_without_ciqual_codes_n": 2,
    "interface_version_created": "20120622",
    "interface_version_modified": "20150316.jqm2",
    "known_ingredients_n": 14,
    "labels": "No gluten",
    "labels_hierarchy": [
      "en:no-gluten"
    ],
    "labels_lc": "en",
    "labels_old": "No gluten",
    "labels_tags": [
      "en:no-gluten"
    ],
    "lang": "en",
    "languages": {
      "en:english": 6
    },
    "languages_codes": {
      "en": 6
    },
    "languages_hierarchy": [
      "en:english"
    ],
    "languages_tags": [
      "en:english",
      "en:1"
    ],
    "last_edit_dates_tags": [
      "2024-06-21",
      "2024-06",
      "2024"
    ],
    "last_editor": "macrofactor",
    "last_image_dates_tags": [
      "2019-11-22",
      "2019-11",
      "2019"
    ],
    "last_image_t": 1574422955,
    "last_modified_by": "macrofactor",
    "last_modified_t": 1718988643,
    "last_updated_t": 1718988643,
    "lc": "en",
    "link": "",
    "main_countries_tags": [],
    "manufacturing_places": "France",
    "manufacturing_places_tags": [
      "france"
    ],
    "max_imgid": "13",
    "minerals_prev_tags": [],
    "minerals_tags": [],
    "misc_tags": [
      "en:ecoscore-changed",
      "en:ecoscore-computed",
      "en:ecoscore-extended-data-not-computed",
      "en:ecoscore-grade-changed",
      "en:ecoscore-missing-data-labels",
      "en:ecoscore-missing-data-origins",
      "en:ecoscore-missing-data-packagings",
      "en:ecoscore-missing-data-warning",
      "en:nutriscore-missing-nutrition-data",
      "en:nutriscore-missing-nutrition-data-saturated-fat",
      "en:nutriscore-missing-nutrition-data-sodium",
      "en:nutriscore-not-computed",
      "en:nutrition-all-nutriscore-values-known",
      "en:nutrition-fruits-vegetables-legumes-estimate-from-ingredients",
      "en:nutrition-fruits-vegetables-nuts-estimate-from-ingredients",
      "en:nutrition-not-enough-data-to-compute-nutrition-score",
      "en:packagings-not-complete",
      "en:packagings-not-empty",
      "en:packagings-not-empty-but-not-complete",
      "en:packagings-number-of-components-2",
      "en:main-countries-fr-unexpectedly-low-scans",
      "en:main-countries-fr-unexpectedly-low-scans-0-10-percent-of-expected",
      "en:main-countries-fr-unexpectedly-low-scans-and-no-data-in-country-language",
      "en:main-countries-fr-product-name-not-in-country-language",
      "en:main-countries-fr-ingredients-not-in-country-language",
      "en:main-countries-fr-no-data-in-country-language",
      "en:main-countries-ch-product-name-not-in-country-language",
      "en:main-countries-ch-ingredients-not-in-country-language",
      "en:main-countries-ch-no-data-in-country-language",
      "en:main-countries-uk-unexpectedly-low-scans",
      "en:main-countries-uk-unexpectedly-low-scans-0-10-percent-of-expected"
    ],
    "no_nutrition_data": "",
    "nova_group": 4,
    "nova_group_debug": "",
    "nova_groups": "4",
    "nova_groups_markers": {
      "3": [
        [
          "ingredients",
          "en:sugar"
        ]
      ],
      "4": [
        [
          "additives",
          "en:e440"
        ],
        [
          "ingredients",
          "en:gelling-agent"
        ]
      ]
    },
    "nova_groups_tags": [
      "en:4-ultra-processed-food-and-drink-products"
    ],
    "nucleotides_prev_tags": [],
    "nucleotides_tags": [],
    "nutrient_levels": {
      "fat": "low",
      "sugars": "high"
    },
    "nutrient_levels_tags": [
      "en:fat-in-low-quantity",
      "en:sugars-in-high-quantity"
    ],
    "nutriments": {
      "carbohydrates": 59,
      "carbohydrates_100g": 59,
      "carbohydrates_serving": 59,
      "carbohydrates_unit": "g",
      "carbohydrates_value": 59,
      "energy": 1008,
      "energy-kcal": 241,
      "energy-kcal_100g": 241,
      "energy-kcal_serving": 241,
      "energy-kcal_unit": "kcal",
      "energy-kcal_value": 241,
      "energy-kcal_value_computed": 240.9,
      "energy-kj": 1008,
      "energy-kj_100g": 1010,
      "energy-kj_serving": 1008,
      "energy-kj_unit": "kJ",
      "energy-kj_value": 1008,
      "energy-kj_value_computed": 1023.1,
      "energy_100g": 1010,
      "energy_serving": 1008,
      "energy_unit": "kJ",
      "energy_value": 1008,
      "fat": 0.1,
      "fat_100g": 0.1,
      "fat_serving": 0.1,
      "fat_unit": "g",
      "fat_value": 0.1,
      "fiber": 1.2,
      "fiber_100g": 1.2,
      "fiber_serving": 1.2,
      "fiber_unit": "g",
      "fiber_value": 1.2,
      "fruits-vegetables-legumes-estimate-from-ingredients_100g": 65,
      "fruits-vegetables-legumes-estimate-from-ingredients_serving": 65,
      "fruits-vegetables-nuts-estimate-from-ingredients_100g": 65,
      "fruits-vegetables-nuts-estimate-from-ingredients_serving": 65,
      "nova-group": 4,
      "nova-group_100g": 4,
      "nova-group_serving": 4,
      "proteins": 0.4,
      "proteins_100g": 0.4,
      "proteins_serving": 0.4,
      "proteins_unit": "g",
      "proteins_value": 0.4,
      "sugars": 59,
      "sugars_100g": 59,
      "sugars_serving": 59,
      "sugars_unit": "g",
      "sugars_value": 59
    },
    "nutriments_estimated": {
      "alcohol_100g": 0,
      "beta-carotene_100g": 1.6e-06,
      "calcium_100g": 0.012457,
      "carbohydrates_100g": 33.863,
      "cholesterol_100g": 0,
      "copper_100g": 1.55e-05,
      "energy-kcal_100g": 144.33,
      "energy-kj_100g": 613.4,
      "energy_100g": 613.4,
      "fat_100g": 0.1645,
      "fiber_100g": 2.3,
      "fructose_100g": 2.0225,
      "galactose_100g": 0,
      "glucose_100g": 1.4185,
      "iodine_100g": 6.14e-06,
      "iron_100g": 0.0001436,
      "lactose_100g": 0.0612,
      "magnesium_100g": 0.008095,
      "maltose_100g": 0.061,
      "manganese_100g": 0.00015889,
      "pantothenic-acid_100g": 8.255e-05,
      "phosphorus_100g": 0.01425,
      "phylloquinone_100g": 2.4e-07,
      "polyols_100g": 0.15,
      "potassium_100g": 0.09315,
      "proteins_100g": 0.398,
      "salt_100g": 0.00805,
      "saturated-fat_100g": 0.0049,
      "selenium_100g": 7.6525e-06,
      "sodium_100g": 0.003201,
      "starch_100g": 0.108,
      "sucrose_100g": 30.0365,
      "sugars_100g": 33.42,
      "vitamin-a_100g": 0,
      "vitamin-b12_100g": 0,
      "vitamin-b1_100g": 6.55e-06,
      "vitamin-b2_100g": 9.15e-06,
      "vitamin-b6_100g": 2.615e-05,
      "vitamin-b9_100g": 5.984e-05,
      "vitamin-c_100g": 0.03364,
      "vitamin-d_100g": 0,
      "vitamin-e_100g": 0.0001875,
      "vitamin-pp_100g": 0.000136,
      "water_100g": 58.856,
      "zinc_100g": 7.5e-05
    },
    "nutriscore": {
      "2021": {
        "category_available": 1,
        "data": {
          "energy": 1010,
          "fiber": 1.2,
          "fruits_vegetables_nuts_colza_walnut_olive_oils": 65,
          "is_beverage": 0,
          "is_cheese": 0,
          "is_fat": 0,
          "is_water": 0,
          "proteins": 0.4,
          "saturated_fat": null,
          "sodium": null,
          "sugars": 59
        },
        "grade": "unknown",
        "nutrients_available": 0,
        "nutriscore_applicable": 1,
        "nutriscore_computed": 0
      },
      "2023": {
        "category_available": 1,
        "data": {
          "energy": 1010,
          "fiber": 1.2,
          "fruits_vegetables_legumes": 65,
          "is_beverage": 0,
          "is_cheese": 0,
          "is_fat_oil_nuts_seeds": 0,
          "is_red_meat_product": 0,
          "is_water": 0,
          "proteins": 0.4,
          "salt": null,
          "saturated_fat": null,
          "sugars": 59
        },
        "grade": "unknown",
        "nutrients_available": 0,
        "nutriscore_applicable": 1,
        "nutriscore_computed": 0
      }
    },
    "nutriscore_2021_tags": [
      "unknown"
    ],
    "nutriscore_2023_tags": [
      "unknown"
    ],
    "nutriscore_grade": "unknown",
    "nutriscore_tags": [
      "unknown"
    ],
    "nutriscore_version": "2021",
    "nutrition_data": "on",
    "nutrition_data_per": "serving",
    "nutrition_data_prepared": "",
    "nutrition_data_prepared_per": "100g",
    "nutrition_grade_fr": "unknown",
    "nutrition_grades": "unknown",
    "nutrition_grades_tags": [
      "unknown"
    ],
    "nutrition_score_beverage": 0,
    "nutrition_score_debug": "missing saturated-fat_100g - missing sodium_100g",
    "nutrition_score_warning_fruits_vegetables_legumes_estimate_from_ingredients": 1,
    "nutrition_score_warning_fruits_vegetables_legumes_estimate_from_ingredients_value": 65,
    "nutrition_score_warning_fruits_vegetables_nuts_estimate_from_ingredients": 1,
    "nutrition_score_warning_fruits_vegetables_nuts_estimate_from_ingredients_value": 65,
    "obsolete": "",
    "obsolete_since_date": "",
    "origin": "",
    "origin_en": "",
    "origins": "",
    "origins_hierarchy": [],
    "origins_lc": "fr",
    "origins_old": "",
    "origins_tags": [],
    "other_nutritional_substances_tags": [],
    "packaging": "Glass, Jar, Glass-bottle, Glass-jar",
    "packaging_hierarchy": [
      "en:glass",
      "en:jar",
      "en:Glass-bottle",
      "en:Glass-jar"
    ],
    "packaging_lc": "en",
    "packaging_materials_tags": [
      "en:glass"
    ],
    "packaging_old": "Glass, Jar, Glass-bottle, Glass-jar",
    "packaging_old_before_taxonomization": "Glass,Jar,en:glass-bottle,en:glass-jar",
    "packaging_recycling_tags": [
      "en:recycle"
    ],
    "packaging_shapes_tags": [
      "en:bottle",
      "en:jar"
    ],
    "packaging_tags": [
      "en:glass",
      "en:jar",
      "en:glass-bottle",
      "en:glass-jar"
    ],
    "packaging_text": "",
    "packaging_text_en": "",
    "packagings": [
      {
        "material": {
          "id": "en:glass"
        },
        "recycling": {
          "id": "en:recycle"
        },
        "shape": {
          "id": "en:bottle"
        }
      },
      {
        "material": {
          "id": "en:glass"
        },
        "shape": {
          "id": "en:jar"
        }
      }
    ],
    "packagings_complete": 0,
    "packagings_materials": {
      "all": {},
      "en:glass": {}
    },
    "packagings_n": 2,
    "photographers_tags": [
      "tacinte",
      "bcatelin",
      "openfoodfacts-contributors",
      "kiliweb"
    ],
    "pnns_groups_1": "Sugary snacks",
    "pnns_groups_1_tags": [
      "sugary-snacks",
      "known"
    ],
    "pnns_groups_2": "Sweets",
    "pnns_groups_2_tags": [
      "sweets",
      "known"
    ],
    "popularity_key": 22999000146,
    "popularity_tags": [
      "top-100000-scans-2019",
      "at-least-5-scans-2019",
      "top-75-percent-scans-2019",
      "top-80-percent-scans-2019",
      "top-85-percent-scans-2019",
      "top-90-percent-scans-2019",
      "top-100-gb-scans-2019",
      "top-500-gb-scans-2019",
      "top-1000-gb-scans-2019",
      "top-5000-gb-scans-2019",
      "top-10000-gb-scans-2019",
      "top-50000-gb-scans-2019",
      "top-100000-gb-scans-2019",
      "top-country-gb-scans-2019",
      "at-least-5-gb-scans-2019",
      "top-5000-ie-scans-2019",
      "top-10000-ie-scans-2019",
      "top-50000-ie-scans-2019",
      "top-100000-ie-scans-2019",
      "top-50000-scans-2020",
      "top-100000-scans-2020",
      "at-least-5-scans-2020",
      "at-least-10-scans-2020",
      "top-75-percent-scans-2020",
      "top-80-percent-scans-2020",
      "top-85-percent-scans-2020",
      "top-90-percent-scans-2020",
      "top-100-gb-scans-2020",
      "top-500-gb-scans-2020",
      "top-1000-gb-scans-2020",
      "top-5000-gb-scans-2020",
      "top-10000-gb-scans-2020",
      "top-50000-gb-scans-2020",
      "top-100000-gb-scans-2020",
      "top-country-gb-scans-2020",
      "at-least-5-gb-scans-2020",
      "top-5000-ie-scans-2020",
      "top-10000-ie-scans-2020",
      "top-50000-ie-scans-2020",
      "top-100000-ie-scans-2020",
      "top-50000-scans-2021",
      "top-100000-scans-2021",
      "at-least-5-scans-2021",
      "at-least-10-scans-2021",
      "top-75-percent-scans-2021",
      "top-80-percent-scans-2021",
      "top-85-percent-scans-2021",
      "top-90-percent-scans-2021",
      "top-500-gb-scans-2021",
      "top-1000-gb-scans-2021",
      "top-5000-gb-scans-2021",
      "top-10000-gb-scans-2021",
      "top-50000-gb-scans-2021",
      "top-100000-gb-scans-2021",
      "top-country-gb-scans-2021",
      "at-least-5-gb-scans-2021",
      "at-least-10-gb-scans-2021",
      "top-5000-ie-scans-2021",
      "top-10000-ie-scans-2021",
      "top-50000-ie-scans-2021",
      "top-100000-ie-scans-2021",
      "top-100000-scans-2022",
      "top-75-percent-scans-2022",
      "top-80-percent-scans-2022",
      "top-85-percent-scans-2022",
      "top-90-percent-scans-2022",
      "top-500-gb-scans-2022",
      "top-1000-gb-scans-2022",
      "top-5000-gb-scans-2022",
      "top-10000-gb-scans-2022",
      "top-50000-gb-scans-2022",
      "top-100000-gb-scans-2022",
      "top-country-gb-scans-2022",
      "top-1000-scans-2023",
      "top-5000-scans-2023",
      "top-10000-scans-2023",
      "top-50000-scans-2023",
      "top-100000-scans-2023",
      "at-least-5-scans-2023",
      "at-least-10-scans-2023",
      "top-75-percent-scans-2023",
      "top-80-percent-scans-2023",
      "top-85-percent-scans-2023",
      "top-90-percent-scans-2023",
      "top-100-gb-scans-2023",
      "top-500-gb-scans-2023",
      "top-1000-gb-scans-2023",
      "top-5000-gb-scans-2023",
      "top-10000-gb-scans-2023",
      "top-50000-gb-scans-2023",
      "top-100000-gb-scans-2023",
      "top-country-gb-scans-2023",
      "at-least-5-gb-scans-2023",
      "at-least-10-gb-scans-2023",
      "top-50000-de-scans-2023",
      "top-100000-de-scans-2023",
      "top-5000-us-scans-2023",
      "top-10000-us-scans-2023",
      "top-50000-us-scans-2023",
      "top-100000-us-scans-2023",
      "top-5000-ca-scans-2023",
      "top-10000-ca-scans-2023",
      "top-50000-ca-scans-2023",
      "top-100000-ca-scans-2023",
      "top-5000-cz-scans-2023",
      "top-10000-cz-scans-2023",
      "top-50000-cz-scans-2023",
      "top-100000-cz-scans-2023",
      "top-5000-hr-scans-2023",
      "top-10000-hr-scans-2023",
      "top-50000-hr-scans-2023",
      "top-100000-hr-scans-2023",
      "top-1000-om-scans-2023",
      "top-5000-om-scans-2023",
      "top-10000-om-scans-2023",
      "top-50000-om-scans-2023",
      "top-100000-om-scans-2023",
      "top-50000-es-scans-2023",
      "top-100000-es-scans-2023",
      "top-1000-jp-scans-2023",
      "top-5000-jp-scans-2023",
      "top-10000-jp-scans-2023",
      "top-50000-jp-scans-2023",
      "top-100000-jp-scans-2023",
      "top-50000-ch-scans-2023",
      "top-100000-ch-scans-2023"
    ],
    "product_name": "Strawberry Jam",
    "product_name_en": "Strawberry Jam",
    "product_quantity": "370",
    "product_quantity_unit": "g",
    "purchase_places": "Liverpool,United Kingdom",
    "purchase_places_tags": [
      "liverpool",
      "united-kingdom"
    ],
    "quantity": "370 g",
    "removed_countries_tags": [],
    "rev": 42,
    "scans_n": 171,
    "selected_images": {
      "front": {
        "display": {
          "en": "https://images.openfoodfacts.org/images/products/304/532/009/4008/front_en.14.400.jpg"
        },
        "small": {
          "en": "https://images.openfoodfacts.org/images/products/304/532/009/4008/front_en.14.200.jpg"
        },
        "thumb": {
          "en": "https://images.openfoodfacts.org/images/products/304/532/009/4008/front_en.14.100.jpg"
        }
      },
      "ingredients": {
        "display": {
          "en": "https://images.openfoodfacts.org/images/products/304/532/009/4008/ingredients_en.33.400.jpg"
        },
        "small": {
          "en": "https://images.openfoodfacts.org/images/products/304/532/009/4008/ingredients_en.33.200.jpg"
        },
        "thumb": {
          "en": "https://images.openfoodfacts.org/images/products/304/532/009/4008/ingredients_en.33.100.jpg"
        }
      },
      "nutrition": {
        "display": {
          "en": "https://images.openfoodfacts.org/images/products/304/532/009/4008/nutrition_en.32.400.jpg"
        },
        "small": {
          "en": "https://images.openfoodfacts.org/images/products/304/532/009/4008/nutrition_en.32.200.jpg"
        },
        "thumb": {
          "en": "https://images.openfoodfacts.org/images/products/304/532/009/4008/nutrition_en.32.100.jpg"
        }
      }
    },
    "serving_quantity": "100",
    "serving_quantity_unit": "g",
    "serving_size": "1 serving (100 g)",
    "sortkey": 1607265034,
    "states": "en:to-be-completed, en:nutrition-facts-completed, en:ingredients-completed, en:expiration-date-completed, en:packaging-code-to-be-completed, en:characteristics-to-be-completed, en:origins-to-be-completed, en:categories-completed, en:brands-completed, en:packaging-completed, en:quantity-completed, en:product-name-completed, en:photos-to-be-validated, en:packaging-photo-to-be-selected, en:nutrition-photo-selected, en:ingredients-photo-selected, en:front-photo-selected, en:photos-uploaded",
    "states_hierarchy": [
      "en:to-be-completed",
      "en:nutrition-facts-completed",
      "en:ingredients-completed",
      "en:expiration-date-completed",
      "en:packaging-code-to-be-completed",
      "en:characteristics-to-be-completed",
      "en:origins-to-be-completed",
      "en:categories-completed",
      "en:brands-completed",
      "en:packaging-completed",
      "en:quantity-completed",
      "en:product-name-completed",
      "en:photos-to-be-validated",
      "en:packaging-photo-to-be-selected",
      "en:nutrition-photo-selected",
      "en:ingredients-photo-selected",
      "en:front-photo-selected",
      "en:photos-uploaded"
    ],
    "states_tags": [
      "en:to-be-completed",
      "en:nutrition-facts-completed",
      "en:ingredients-completed",
      "en:expiration-date-completed",
      "en:packaging-code-to-be-completed",
      "en:characteristics-to-be-completed",
      "en:origins-to-be-completed",
      "en:categories-completed",
      "en:brands-completed",
      "en:packaging-completed",
      "en:quantity-completed",
      "en:product-name-completed",
      "en:photos-to-be-validated",
      "en:packaging-photo-to-be-selected",
      "en:nutrition-photo-selected",
      "en:ingredients-photo-selected",
      "en:front-photo-selected",
      "en:photos-uploaded"
    ],
    "stores": "Asda",
    "stores_tags": [
      "asda"
    ],
    "teams": "swipe-studio",
    "teams_tags": [
      "swipe-studio"
    ],
    "traces": "",
    "traces_from_ingredients": "",
    "traces_from_user": "(fr) ",
    "traces_hierarchy": [],
    "traces_lc": "fr",
    "traces_tags": [],
    "unique_scans_n": 146,
    "unknown_ingredients_n": 0,
    "unknown_nutrients_tags": [],
    "update_key": "20240209",
    "vitamins_prev_tags": [],
    "vitamins_tags": [],
    "weighers_tags": []
  },
  "result": {
    "id": "product_found",
    "lc_name": "Product found",
    "name": "Product found"
  },
  "status": "success",
  "warnings": []
}"""
}